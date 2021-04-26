package be.thomasmore.hummingbee.Repositories;

import be.thomasmore.hummingbee.Model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Integer> {
}
