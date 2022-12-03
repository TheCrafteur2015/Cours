/* UPPER, LOWER */

Select	netud, UPPER( nometud ), LOWER( prenometud )
From	Etudiant;

/*  Cette requête affiche les numéros, les noms en MAJUSCULE et les prénoms en minuscule des étudiants  */


/* SUM */

Select	SUM( salaire )
From	Emploi;

/*  Cette requête calcule le total des salaires de tous les employés  */


/* AVG */

Select	AVG( moy )
From	Note;

/*  Cette requête calcule la moyenne des notes  */
