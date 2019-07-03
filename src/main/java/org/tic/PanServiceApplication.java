package org.tic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tic.dao.ArticleRepository;
import org.tic.dao.PanierRepository;
import org.tic.entities.Article;
import org.tic.entities.Panier;


@SpringBootApplication
public class PanServiceApplication implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private PanierRepository panierRepository;


    public static void main(String[] args) {
        SpringApplication.run(PanServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


        articleRepository.deleteAll();
        panierRepository.deleteAll();

        Panier panierUser1 = new Panier("panier utilisateur 1");
        Panier panierUser2 = new Panier("panier utilisateur 2");

        panierRepository.save(panierUser1);
        panierRepository.save(panierUser2);

        articleRepository.save(new Article("Fraises", panierUser1));
        articleRepository.save(new Article("Tomates", panierUser1));
        articleRepository.save(new Article("Patates", panierUser1));

        articleRepository.save(new Article("Fraises", panierUser2));
        articleRepository.save(new Article("Tomates", panierUser2));
        articleRepository.save(new Article("Concombres", panierUser2));


        articleRepository.findAll().forEach(ar -> {
            System.out.println(ar);
        });



    }
}
