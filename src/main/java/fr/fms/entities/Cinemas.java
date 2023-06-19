package fr.fms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cinemas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cinemaId;
    private String cinemaName;
    private String cinemaAddress;
    private int cinemaZipCode;
    private String cinemaCity;

    @OneToMany(mappedBy = "cinemas")
    private Collection<Movies> movie;

}
