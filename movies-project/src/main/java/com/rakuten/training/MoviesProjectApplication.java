package com.rakuten.training;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.MovieDAO;
import com.rakuten.training.domain.Movie;

@SpringBootApplication
public class MoviesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesProjectApplication.class, args);
		
		
		
		MovieDAO dao = springContainer.getBean(MovieDAO.class);

		Movie aMovie = new Movie("https://dsda","Abcd","Lorem epsum",3,2,"comedy");
		Movie saved = dao.save(aMovie);
		System.out.println("Saved Movie with id : " + saved.getId());

		//List<Movie> all = dao.findAll();
		//System.out.println("there are " + all.size() + " Movies.");
		//System.out.println("Removing newly added Movie....");
		//dao.deleteById(saved.getId());

	}

	//public static void testCustomerDAO(ApplicationContext springContainer) {
		//CustomerDAO dao = springContainer.getBean(CustomerDAO.class);
		
		//Customer c = new Customer("fn", "ln", "fn.ln@a.com");
		//dao.save(c);
		
//	}

//}
	}

}
