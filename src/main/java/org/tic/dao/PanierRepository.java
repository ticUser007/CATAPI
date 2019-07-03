package org.tic.dao;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.tic.entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestController
public interface PanierRepository extends JpaRepository <Panier, Long> {
}
