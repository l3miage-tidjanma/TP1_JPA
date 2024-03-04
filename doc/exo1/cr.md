# -CarEntity-
## le début

* compréhension des EnumType/STRING et .ORDINAL
* ajout de clé primaire @ID et d'attributs @Column

# -BikeEntity-

## 2 Définition d'une entité qui n'existe pas en BD
après l'usage de la commande 'mvn test':

_en recherchant dans le terminal TestExo1 pas à pas_, je trouve la 1ère erreur

at fr.uga.l3miage.tp1.exo1.TestExo1.initialise(TestExo1.java:19)"

on trouve la fonction:

@BeforeAll
static void initialise(){
DatabaseScriptExecutor.createDatabaseExo1();
}

_NB:_

Note :
Pour la valeur spring.jpa.hibernate.ddl-auto, 5 modes sont possibles :

mode	fonction
* create	Permet de créer le schéma détecté en base de donnés au démarrage du serveur spring

* create-drop	Même action que create, et il va en plus supprimer toutes les tables en BD lors de l'arrêt du serveur Spring

* update	Fait une comparaison entre le modèle JPA et le modèles physique et applique les modifications nécessaires

* validate	Permet de valider si le modèle JPA correspond au modèle physique en BD

* none	Ne fait rien
