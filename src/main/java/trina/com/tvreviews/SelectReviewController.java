package trina.com.tvreviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelectReviewController {

	@Resource
	private ReviewRepository reviewRepo;
	
	@RequestMapping("/form/selectReview")
	public String showForm(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "form/selectReviewForm";
	}
	
}
