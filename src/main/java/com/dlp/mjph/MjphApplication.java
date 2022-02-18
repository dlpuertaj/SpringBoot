package com.dlp.mjph;

import com.dlp.mjph.model.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class MjphApplication {

	public static void main(String[] args) {
		SpringApplication.run(MjphApplication.class, args);
	}

	@GetMapping
	public List<Movie> hello(){

		List<Movie> list = new ArrayList<>();
		Movie movie = new Movie("The Lord of the Rings",
								"Movie", 2000,
								LocalDate.now()
				);
		list.add(movie);

		return list;
	}
}
