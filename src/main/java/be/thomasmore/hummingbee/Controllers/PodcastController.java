package be.thomasmore.hummingbee.Controllers;

import be.thomasmore.hummingbee.Model.Podcast;
import be.thomasmore.hummingbee.Repositories.PodcastRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/podcast")
public class PodcastController {
    private Logger logger = LoggerFactory.getLogger(PodcastController.class);

    @Autowired
    private PodcastRepository podcastRepository;

    @GetMapping({ "/podcasts"})
    public String home(Model model) {
        Iterable<Podcast> podcasts = podcastRepository.findAll();
        model.addAttribute("podcasts", podcasts);
        model.addAttribute("nrPodcats", podcastRepository.count());
        return "podcasts";
    }


    
    @GetMapping("/podcastdetails/{id}")
    public String podcastDetails(Model model, @PathVariable int id) {
        return "podcast/podcastdetails";
    }

}
