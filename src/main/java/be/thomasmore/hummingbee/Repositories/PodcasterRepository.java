package be.thomasmore.hummingbee.Repositories;


import be.thomasmore.hummingbee.Model.Podcaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcasterRepository extends JpaRepository<Podcaster, Integer> {
}
