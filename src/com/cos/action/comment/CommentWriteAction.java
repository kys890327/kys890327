package com.cos.action.comment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.action.Action;
import com.cos.action.IOException;

public class CommentWriteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int userId = Integer.parseInt(request.getParameter("userId"));
		int boardId = Integer.parseInt(request.getParameter("boardId"));
		String content = request.getParameter("content");
		
		
	}
}
