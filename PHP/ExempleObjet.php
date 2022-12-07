<?php



public $nom
public $lig
public $col

public function __construct($nom, $lig, $col) {
 
  $this->nom = $nom;
  $this->lig = $lig;
  $this->col = $col;
  
}

public function toString() {
 
  echo "Nom : $this->nom, Ligne : $this->lig, Colonne : $this->col";
  
}

?>
