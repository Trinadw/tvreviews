package trina.com.tvreviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateReviewsController {

	@Resource
	private GenreRepository genreRepo;
	@Resource
	private ReviewRepository reviewRepo;
	
	@RequestMapping("/deleteReview")
	public String deleteReview(@RequestParam long tagId, @RequestParam long reviewId){
		reviewRepo.delete(reviewId);
		return "redirect:/tag?tagId=" + tagId;
	}
	
//	@RequestMapping("/createReview")
//	public String createReview(@RequestParam long tagId, @RequestParam String name, @RequestParam String)
//}
}
