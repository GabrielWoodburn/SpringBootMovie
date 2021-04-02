package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Movie;
import dmacc.repository.MovieRepository;

@Controller
public class WebController {
	@Autowired
	MovieRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllMovies(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewMovie(model);
		}
		
		model.addAttribute("movies", repo.findAll());
		return "results";
	}

	@GetMapping("/inputMovie")
	public String addNewMovie(Model model) {
		Movie c = new Movie();
		model.addAttribute("newMovie", c);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateMovie(@PathVariable("id") long id, Model model) {
		Movie c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newMovie", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseMovie(Movie c, Model model) {
		repo.save(c);
		return viewAllMovies(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Movie c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllMovies(model);
	}
}
