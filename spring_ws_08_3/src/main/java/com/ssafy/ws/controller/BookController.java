package com.ssafy.ws.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ws.model.dto.Book;
import com.ssafy.ws.model.dto.SearchCondition;
import com.ssafy.ws.model.service.BookService;


@Controller
@RequestMapping("/bookapi")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
//	@GetMapping("/book")
//	public String  list() {
//		System.out.println("TEST");
//		return "redirect:/assets/list.html";
//	}
	
	@GetMapping("/book/add")
	public String add() {
		return "redirect:/assets/add.html";
	}
	
	// 도서목록
	@GetMapping("/book/list")
	@ResponseBody
	public ResponseEntity<?> getBooks(){
		List<Book> books = bookService.search(new SearchCondition());
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}
	
	// 도서추가
	@PostMapping("book")
	@ResponseBody
	public String insertBook(@RequestBody Book book) {
		try {
			if(bookService.insert(book, null) == 1) {
				return "success";
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return "fail";
		} catch (IOException e) {
			e.printStackTrace();
			return "fail";
		}
		return "fail";
	}
}
