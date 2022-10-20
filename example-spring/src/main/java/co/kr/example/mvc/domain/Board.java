package co.kr.example.mvc.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Board {

	private int boardSeq;
	private String title, contents;
	private Date regDate;
	
}
