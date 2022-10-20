package co.kr.example.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.kr.example.mvc.domain.Board;
import co.kr.example.mvc.repository.BoardRepository;

/**
 * 게시판 서비스
 * @author Ryu
 */
@Service
public class BoardService {

	@Autowired
	private BoardRepository repo;
	
	/**
	 * 목록 리턴.
	 * @return
	 */
	public List<Board> getList() {
		return repo.getList();
	}

	/**
	 * 상세 정보 리턴.
	 * @param boardSeq
	 * @return
	 */
	public Board get(int boardSeq) {
		return repo.get(boardSeq);
	}
	
	/**
	 * 등록 처리.
	 * @param board
	 */
	public void save(Board board) {
		repo.save(board);
	}
	
	/**
	 * 업데이트 처리.
	 * @param board
	 */
	public void update(Board board) {
		repo.update(board);
	}
	
	/**
	 * 삭제 처리.
	 * @param boardSeq
	 */
	public void delete(int boardSeq) {
		repo.delete(boardSeq);
	}
	
	
}
