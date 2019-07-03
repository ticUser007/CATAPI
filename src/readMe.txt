
Ceci est un projet demo

Le projet est bati avec SpringBoot

Le but est d offrir une API REST qui gere les produits (ou artricles), les paniers

Nous avons utilise 2 annotations de rest Controllers:

@RepositoryRestController de JPA qui permet d offrir les fonctionalites de base: liste, addition, creation et suppression

@RestController pour les operations de connexion / deconnnexion
(on aurait pu enrichir la connexion avec Spring Security jwt ou form based)


Pour les tests unitaires: nous avons utilise test_api.http ainsi avec Intellij on puet rouler des tests
de creation, de suppresions (exemple: GET {{host-url}}/paniers)

la classe Main : PanServiceApplication initialise la BD InMemory (et aussi la BD dans un fichier)
spring.datasource.url=jdbc:h2:file:./produit.db

L application peut etre bati sous forme de microservice dans un JAR 