package be.thomasmore.hummingbee.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Podcaster {
    @Id
    private int id;


}
