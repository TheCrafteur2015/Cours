Select	Concat(netud, '=', nometud)
From	Etudiant;

/*  Cette requête crée une colonne personnaliée constituée des valeurs de la colonne 'netud' et 'nometud'  */
/*  Résultat : 1=Simon  */

Select	Concat(netud, '=', nometud) As nom
From	Etudiant;

/*  Requête identique à la précédente mais la nouvelle colonne s'appelle 'nom'  */
