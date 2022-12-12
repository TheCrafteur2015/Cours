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
- putchar( var ) : affiche sur la console le caractère de la variable *var* en paramètre