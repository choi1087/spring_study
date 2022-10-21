package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssafy.board.model.dao.BoardMapper;
import com.ssafy.board.model.dto.BoardDto;
import com.ssafy.board.model.dto.MemberDto;

@Service
public class BoardService {

	private static final int COUNT_PER_PAGE = 10;

	@Autowired
	private BoardMapper dao;

	public Map<String, Object> makePage(int page) {
		int totalCount = dao.selectTotalCount(); // 총 게시글의 갯수

		int totalPage = totalCount / COUNT_PER_PAGE;
		if (totalCount % COUNT_PER_PAGE > 0) { // 53 % 10 = 3이면 하나 더 필요함
			totalPage++;
		}

		int startPage = (page - 1) / 10 * 10 + 1; // /10 * 10 하면 1의 자리가 떨어져 나가서 11, 12, 13, ... -> 10 되버림
		int endPage = startPage + 9; // 시작이 11이면 화면 하단 끝 페이지는 20으로 맞춰놨음

		if (endPage > totalPage) {
			endPage = totalPage;
		}

		int startRow = (page - 1) * COUNT_PER_PAGE; // (1-1)*10=0, (2-1)*10=10, (3-1)*10=20
		List<BoardDto> boardList = dao.selectList(startRow, COUNT_PER_PAGE);

		///// 페이지에 보여줄 모든 데이터 확보 완료 //////
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("startPage", startPage);
		result.put("endPage", endPage);
		result.put("currPage", page);
		result.put("totalPage", totalPage);
		result.put("boardList", boardList);
		return result;
	}

	public boolean write(BoardDto board) {
		if (board == null || board.getTitle() == null || board.getTitle().length() == 0 || board.getWriter() == null
				|| board.getWriter().length() == 0) {
			return false;
		}

		if (dao.insert(board) == 1) {
			return true;
		}
		return false;
	}

	public BoardDto read(int bno, MemberDto loginInfo) {
		BoardDto board = dao.selectOne(bno);
		// 현재 로그인 정보와 글 작성자가 다를 때에만 조회수 증가시키기
		if (!board.getWriter().equals(loginInfo.getId())) {
			dao.updateReadCount(bno); // 이따 로그인 붙이면 내가 쓴 글 입ㄺ을 때는 조회수 증가 안함
		}
		return board;
	}
}
