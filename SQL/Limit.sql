SELECT	*
FROM	Etudiant
LIMIT	3, 5;

-- ou

SELECT	*
FROM	Etudiant
OFFSET	3
LIMIT	5;

/*  Ces deux requêtes affichent 5 lignes à partir de la ligne n°3  */
