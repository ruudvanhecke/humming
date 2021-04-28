package be.thomasmore.hummingbee.Controllers;

import be.thomasmore.hummingbee.Model.Podcast;
import be.thomasmore.hummingbee.Model.Podcaster;
import be.thomasmore.hummingbee.Repositories.PodcastRepository;
import be.thomasmore.hummingbee.Repositories.PodcasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/podcast")
public class PodcastController {
    @Autowired
    private PodcastRepository podcastRepository;
    @Autowired
    private PodcasterRepository podcasterRepository;




    
    @GetMapping("/podcastdetails/{id}")
    public String podcastDetails(Model model, @PathVariable int id) {
        return "podcast/podcastdetails";
    }


    @GetMapping( "/podcastlist")
    public String podcastlist(Model model) {
        List<Podcaster> podcasters = podcasterRepository.findAll();
        model.addAttribute("podcasterlist", podcasters);
        return "podcastlist";
    }
}
