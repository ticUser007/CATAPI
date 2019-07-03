package org.tic.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Article {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Panier panier;


    public Article(String description, Panier panier) {
        this.description = description;
        this.panier = panier;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", description=" + description  + "]";
    }

}
