# binôme: 
## TIDJANI Manyl
## HADDAD Rayan

# Reponses

## Q1)
<img src="/home/ecloud/TP1_JPA/pgAdmin_class_testjpa.png">

Lorsque je déclare la classe 'ClassTestJPA' avec des annotations @Entity et @Id, et que je la mappe sur une BD à l'aide de JPA, voici ce que j'observe en BD via pgAdmin :

- Une table nommée class_test_jpa est créée dans la base de données example-db.
- Les colonnes de cette table correspondent aux champs de la classe ClassTestJPA, avec le type de données approprié:
  - my_id_test est de type 'character varying' avec une précision de 255.
  - jpa_seed est de type 'double precision'
  - power_type est de type 'integer'
  - saved_at est de type 'date'

- La colonne myIdTest est définie comme clé primaire 'class_testjpa_pkey' dans la table, car elle est annotée avec @Id.

## Q2)
<img src="/home/ecloud/TP1_JPA/pgAdmin_class_testjpatwo.png">

Dans la classe ClassTestJPATwo, des annotations @Column sont ajoutées avec des contraintes tels que unique et precision. Voici les effets de ces propriétés :

- L'annotation @Column(unique=true) sur le champ testName indique que les valeurs de ce champ doivent être uniques dans la colonne correspondante de la table. Cela garantit qu'aucune autre ligne de la table ne peut avoir la même valeur pour ce champ.
- L'annotation @Column(precision = 1) sur le champ jpaSeed spécifie le nombre de chiffres significatifs pour ce champ dans la base de données. Dans ce cas, il est défini sur 1, ce qui signifie qu'il y aura une seule décimale autorisée pour ce champ dans la base de données.
- L'annotation @Column sans aucun attribut est utilisée pour définir les propriétés par défaut pour une colonne. Dans ce cas, cela s'applique au champ savedAt.

NB: pour la culture G, je suis allé rechercher quelles étaient ces propriétés par défaut, les voici:
- Nom de la colonne : Le nom de la colonne dans la table de base de données sera dérivé du nom du champ Java auquel l'annotation @Column est appliquée.
- Type de données : Le type de données de la colonne sera déduit à partir du type de données du champ Java correspondant. Par exemple, si le champ Java est de type String, la colonne sera de type VARCHAR par défaut.
- Nullable : Par défaut, la colonne autorise les valeurs nulles, c'est-à-dire qu'elle n'a pas la contrainte NOT NULL.
- Insertabilité et mise à jour : Par défaut, les valeurs de la colonne peuvent être insérées (insertable = true) et mises à jour (updatable = true).
- Unique : Par défaut, la colonne n'a pas la contrainte d'unicité, ce qui signifie que les valeurs peuvent être répétées.

En conclusion, l'annotation @Column permet de personnaliser le mapping entre les champs d'une entité et les colonnes correspondantes dans une table de base de données relationnelle, en définissant diverses propriétés et contraintes pour chaque colonne.

## Q3)
De ce fait, d'après la réponse à la question 2 il est nécessaire de mettre les annotations @Column dans les cas où:
- Lorsque je souhaite personnaliser les propriétés d'une colonne telles que Cela peut inclure des propriétés telles que unique, nullable, insertable, updatable, precision, scale, etc.
- Lorsque j'ai besoin de faire le mappage de nom de colonne personnalisé, entre les champs de la classe et les colonnes de la table, dans la base de données.