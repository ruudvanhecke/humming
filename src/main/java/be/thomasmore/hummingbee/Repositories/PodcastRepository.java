package be.thomasmore.hummingbee.Repositories;

import be.thomasmore.hummingbee.Model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Integer> {

    List<Podcast> findByIdIn(Integer[] ids);

}
