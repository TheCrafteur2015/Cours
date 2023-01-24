/* UPPER, LOWER */

SELECT	netud, UPPER( nometud ), LOWER( prenometud )
FROM	  Etudiant;

/*  Cette requête affiche les numéros, les noms en MAJUSCULE et les prénoms en minuscule des étudiants  */


/* SUM */

SELECT	SUM( salaire )
FROM  	Emploi;

/*  Cette requête calcule le total des salaires de tous les employés  */


/* AVG */

SELECT	AVG( moy )
FROM  	Note;

/*  Cette requête calcule la moyenne des notes  */


/* MAX */

SELECT  MAX( moy )
FROM    Note;

/* Cette requête retourne la note maximale */


/* MIN */

SELECT  MIN( moy )
FROM    Note;

/* Cette requête renvoie la note minimale */


/* COUNT */

SELECT  COUNT( moy )
FROM    Note;

/* Cette requête renvoie le nombre de notes */
