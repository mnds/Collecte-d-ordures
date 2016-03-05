# Collecte-d-ordures

Bienvenue sur le projet WS/Android ayant pour objet la gestion de la collecte d'ordures. Afin que le repository soit bien utilisé, je me permettrais de donner quelques indications qui nous faciliteront le travail:

- Toujours faire précéder les descriptions de commit par son trigramme entre crochets, c'est-à-dire la première lettre du prénom et les deux premières lettres du nom, comme ça on saura plus facilement qui a fait quoi;
Exemple: [MSA] exemple de commit
- Rendre les commit le plus atomique possible: par là j'entends qu'un commit ne doit porter que sur une fonctionnalité à la fois, cela facilite les revert;

Vous aurez aussi à configurer votre serveur glassfish pour que l'authentification fonctionne correctement. Dans le dossier bin/ de ce dernier, taper la commande suivante:

asadmin create-auth-realm --classname com.sun.enterprise.security.auth.realm.jdbc.JDBCRealm --property jaas-context=jdbcRealm:datasource-jndi="jdbc/collecteOrdures":user-table=utilisateur:user-name-column=login:password-column=password:group-table=utilisateur:group-name-column=typeutilisateur:digest-algorithm=none userAuthRealm

À noter qu'il faudra au préalable créer une datasource jdbc/collecteOrdures dans glassfish (voir le fichier glassfish-resources.xml pour les options).

Voilà c'est tout ! Pour ceux qui ne sont pas encore familiers avec git, je vous invite à consulter le tuto d'openclassrooms pour une prise en main rapide: https://openclassrooms.com/courses/gerez-vos-codes-source-avec-git

Allez au boulot !
