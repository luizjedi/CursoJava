package Secao_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class StringBuilder {

	public static void main(String[] args) throws ParseException {

		// Instancia um formato padrão de data e hora.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// Instancia os dois comentários.
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");

		// Instacia o post 1.
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		// Adiciona dois comentários ao post 1.
		p1.addComment(c1);
		p1.addComment(c2);

		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the Force be with you!");

		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
				"Good nigth guys", "See you tomorrow!", 5);

		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
