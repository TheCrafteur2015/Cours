Select  *
From    Note
Where   moy > 10;

/*  Le 'Where' permet d'ajouter des conditions à la requête. Ici, seul les tuples dont la moyenne est supérieure à 10 seront affichés  */


/* AND */

Select  *
From    Etudiant
Where   nometud != 'SIMON' AND
        groupetud = 'A';

/*  Cette requête affichera les tuples dont le nom n'est pas 'SIMON' et qui font parti du groupe A  */


/*  OR  */

Select  *
From    Etudiant
Where   groupetud = 'A' OR
        groupetud = 'C';

/*  Cette requête affichera les tuples dont le groupe est soit A soit C  */

/*  IN  */

Select  *
From    Matiere
Where   nommat IN ('BADO', 'ARCHI');

/*  Cette requête affichera les tuples dont la matière est ARCHI et BADO  */


/*  BETWEEN  */

Select  *
From    Note
Where   moy BETWEEN 5 AND 10;

/*  Cette requête affichera les tuples où la moyenne se trouve entre 5 et 10 compris  */
