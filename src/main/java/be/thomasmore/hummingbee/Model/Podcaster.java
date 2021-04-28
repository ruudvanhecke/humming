package be.thomasmore.hummingbee.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Podcaster {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "podcaster_generator")
    @SequenceGenerator(name = "podcaster_generator", sequenceName = "podcaster_seq", allocationSize = 1)
    @Id
    private int id;
    private String podcasterNama;
    @Column(length = 1000)
    private String pocasterBio;

    public Podcaster(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPodcasterNama() {
        return podcasterNama;
    }

    public void setPodcasterNama(String podcasterNama) {
        this.podcasterNama = podcasterNama;
    }

    public String getPocasterBio() {
        return pocasterBio;
    }

    public void setPocasterBio(String pocasterBio) {
        this.pocasterBio = pocasterBio;
    }
}
