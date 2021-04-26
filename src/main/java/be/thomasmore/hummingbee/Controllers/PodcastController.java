package be.thomasmore.hummingbee.Controllers;

import be.thomasmore.hummingbee.Repositories.PodcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/podcast")
public class PodcastController {
    @Autowired
    private PodcastRepository podcastRepository;



    
    @GetMapping("/podcastdetails/{id}")
    public String podcastDetails(Model model, @PathVariable int id) {
        return "podcast/podcastdetails";
    }

}
