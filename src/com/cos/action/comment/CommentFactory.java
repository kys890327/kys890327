package com.cos.action.comment;

import com.cos.action.Action;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class CommentFactory {
	public static Action getAction(String cmd) {
		if(cmd.equals("delete")) {
			return new CommentDeleteAction();
		}if(cmd.equals("write")) {
			return new CommentWriteAction();
		return null;
		
	}
}
}