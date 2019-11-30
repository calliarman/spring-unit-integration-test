package com.mgiglione.model;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Builder
public class Manga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Integer volumes;
    private Double score;

    public Manga(String title, String description, Integer integer, Double aDouble) {
        this.title = title;
        this.description = description;
        this.volumes = integer;
        this.score = aDouble;
    }
}
