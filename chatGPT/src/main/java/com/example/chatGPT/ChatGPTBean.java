package com.example.chatGPT;

import java.io.Serializable;

public class ChatGPTBean implements Serializable {
	//it is an interface which converts object into byte stream, and then into file and then saved in db

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String prompt;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	@Override
	public String toString() {
		return "ChatGPTBean [title=" + title + ", prompt=" + prompt + "]";
	}

}