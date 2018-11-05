package com.jinronara.domain;

import javax.persistence.*;

@Entity
public class Posts {

	protected Posts() {
	}

	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 500, nullable = false)
	private String title;
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;
	private String author;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getAuthor() {
		return author;
	}

	public Posts(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}

	public static PostsBuilder builder() {
		return new PostsBuilder();
	}

	public static class PostsBuilder {
		private String title;
		private String content;
		private String author;

		public PostsBuilder title(String title) {
			this.title = title;
			return this;
		}

		public PostsBuilder content(String content) {
			this.content = content;
			return this;
		}

		public PostsBuilder author(String author) {
			this.author = author;
			return this;
		}

		public Posts build() {
			return new Posts(title, content, author);
		}	   
	            
	}

}