package exercice_3;

public abstract class Iterator {
	abstract void init(); // se positionne sur le premier element 
	abstract Object suivant(); // passe a l’element suiv. et le retourne 
	abstract boolean fini(); // se trouve-t-on sur le dernier element ? 
	abstract Object courant(); // retourne l’element courant
}
