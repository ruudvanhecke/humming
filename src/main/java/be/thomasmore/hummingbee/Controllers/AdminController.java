package be.thomasmore.hummingbee.Controllers;


import be.thomasmore.hummingbee.Model.Podcast;
import be.thomasmore.hummingbee.Repositories.PodcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private PodcastRepository podcastRepository;


    @ModelAttribute("podcast")
    public Podcast findPodcast(@PathVariable(required = false) Integer id) {
        if (id != null) {
            Optional<Podcast> optionalPodcast = podcastRepository.findById(id);
            if (optionalPodcast.isPresent()) return optionalPodcast.get();
        }
        return new Podcast();
    }

    @GetMapping("/podcastnew")
    public String podcastNew(Model model) {
        model.addAttribute("podcasts", podcastRepository.findAll());
        return "admin/podcastnew";
    }

    @PostMapping("/podcastnew")
    public String podcastNewPost(Model model, @ModelAttribute("podcast") Podcast podcast) {
        podcastRepository.save(podcast);
        return "redirect:/podcastdetails/"+ podcast.getId();
    }
}
