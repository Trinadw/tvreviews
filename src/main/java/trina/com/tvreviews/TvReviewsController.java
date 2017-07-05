package trina.com.tvreviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TvReviewsController {
	
		@Resource
		ReviewRepository reviewRepo;
		
		@Resource
		GenreRepository genreRepo;
//list the genres-genres html
		@RequestMapping("/genres")
		public String fetchReviews(Model model) {
			model.addAttribute("genreAsCollection", genreRepo.findAll());
			return "genres";
		}
		// individual genre-onegenre html 
		@RequestMapping("/onegenre")
	    public String fetchOneGenre(@RequestParam(value="id") Long id, Model model) {
	         model.addAttribute("onegenre", genreRepo.findOne(id));
	         return "onegenre";
	     }
		
		//review for the show-onereview html
		@RequestMapping("/onereview")
	    public String fetchOne(@RequestParam(value="id") Long id, Model model) {
	         model.addAttribute("onereview", reviewRepo.findOne(id));
	         return "onereview";
	     }
		
	}

