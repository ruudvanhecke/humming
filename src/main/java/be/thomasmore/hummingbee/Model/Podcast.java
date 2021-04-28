package be.thomasmore.hummingbee.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Podcast {
    @Id
    private int id;
    private String naam;
    private String beschrijving;


    public int getId(){
        return id;
    }

}
