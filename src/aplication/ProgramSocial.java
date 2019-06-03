package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramSocial {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("have a nice trip");
		Comment c2 = new Comment("wow thats's awesome!");
		
		Post p1 = new Post(
				sdf.parse("21/15/1999 13:05:44"),
				"Traveling to new Zeland",
				"i'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);

	}

}
