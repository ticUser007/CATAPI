package org.tic.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Panier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "panier", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Article> articles;

    public Panier(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Panier [id=" + id + ", description=" + description  + "]";
    }
}
