package co.kr.example.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import co.kr.example.mvc.domain.Board;
import co.kr.example.mvc.service.BoardService;

/**
 * 게시판 컨트롤러
 * @author Ryu
 *
 */
@RestController
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	/**
	 * 목록 리턴.
	 * @return
	 */
	@GetMapping
	public List<Board> getList() {
		return boardService.getList();
	}
	
	/**
	 * 상세 정보 리턴.
	 * @param boardSeq
	 * @return
	 */
	@GetMapping("{boardSeq}")
	public Board get(@PathVariable int boardSeq) {
		return boardService.get(boardSeq);
	}
	
	/**
	 * 등록/수정 처리.
	 * @param board
	 */
//	@PutMapping
//	@PostMapping
//	실무에서는 데이터를 받아서 처리하는 save 또는 update 등은 GetMapping 보다는 PutMapping이나 PostMapping을 사용하는 것을 권장함. 
	@GetMapping
	public void save(Board board) {
		boardService.save(board);
	}
	
	/**
	 * 업데이트 처리.
	 * @param board
	 */
	@GetMapping
	public void update(Board board) {
		boardService.update(board);
	}
	
	/**
	 * 삭제 처리.
	 * @param boardSeq
	 */
	@GetMapping
	public void delete(int boardSeq) {
		boardService.delete(boardSeq);
	}
}
