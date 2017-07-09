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

	@Resource
	TagRepository tagRepo;

	// list the genres-genres html
	@RequestMapping("/genres")
	public String fetchReviews(Model model) {
		model.addAttribute("genreAsCollection", genreRepo.findAll());
		return "genres";
	}

	// individual genre-onegenre html
	@RequestMapping("/onegenre")
	public String fetchOneGenre(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("onegenre", genreRepo.findOne(id));
		return "onegenre";
	}

	// review for the show-onereview html
	@RequestMapping("/onereview")
	public String fetchOne(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("onereview", reviewRepo.findOne(id));
		return "onereview";
	}

	@RequestMapping("/tags")
	public String showTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tag")
	public String fetchOneTag(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}

	@RequestMapping("/deleteTag")
	public String deleteTag(@RequestParam long id) {
		Tag toDelete = tagRepo.findOne(id);
		for (Review reviews : toDelete.getReviews()) {
			reviews.remove(toDelete);
			reviewRepo.save(reviews);
		}
		tagRepo.delete(toDelete);
		return "redirect:/onereview?id=" + id;
	}
@RequestMapping("/addTag")
public String createTag(long id, String tag) {
	Tag newTag = new Tag(tag);
	tagRepo.save(newTag); 
	Review reviews = reviewRepo.findOne(id);
	reviews.add(newTag);
	reviewRepo.save(reviews);
	return "redirect:/onereview?id=" + id;
}


	
}


