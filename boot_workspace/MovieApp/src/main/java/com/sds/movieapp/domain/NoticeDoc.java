package com.sds.movieapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="notice")
public class NoticeDoc {
	
	@Id
	private String id; 
	
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private int hit;
}





