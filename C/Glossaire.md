### Pour compiler

Compiler un fichier C :
```bash
gcc *NOM_DU_FICHIER*.c -o *NOM_DU_FICHIER_DE_SORTIE*.x 
```

Exécuter un fichier C :
```bash
./*NOM_DU_FICHIER*.x
```

Si le fichier n'a pas l'autorisation d'exécution :
```bash
chmod u+x *NOM_DU_FICHIER*
```

### Méthodes

- getchar() : récupère le premier caractère entré dans la console
- putchar( *var* ) : affiche sur la console le caractère de la variable *var* en paramètre
- unsigned : le type unsigned permet de créer une variable dont la valeur est toujours positive
- signed : le type signed permet de créer une variable dont la valeur peut être positive ou négative (Par défaut)
- printf( "%02d", *var* ) : permet d'afficher une chaîne formatée où la valeur numérique de la variable *var* est complétée par deux zéros
  - %d : utilisé pour les nombre entiers
  - %s : utilisé pour les chaînes
  - %c : utilisé pour les caractères
  - %f : utilisé pour les réels
  - %u : utilisé pour les entiers non-signés
  - %x : utilisé pour les valeurs hexadécimales
- sizeof( *char* ) : retourne la taille du type *char*
- char *NOM*[*TAILLE*] : permet de créer une pseudo chaîne (un tableau de caractères) de taille *TAILLE*
- wchar_t : type de variable caractère permettant d'utiliser des caractères unicode (à importer avec : #include<wchar.h>)
- puts( *var* ) : affiche la chaîne *var*
- fgets( *var*, *TAILLE*, stdin ) : permet de lire une chaîne de caractères. La variable *var* correspond à la variable