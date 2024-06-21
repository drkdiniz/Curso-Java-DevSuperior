package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDate date;
	private String title;
	private String content;
	private Integer like;
	
	private List<Comment> comments = new ArrayList<>();
	
	
	public Post() {
	}
	
	public Post(LocalDate date, String title, String content, Integer like) {
		super();
		this.date = date;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}


	
	
	
	
	
	
}
