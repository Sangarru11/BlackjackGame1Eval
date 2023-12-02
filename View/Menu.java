package View;

public class Menu {
    public static int mainMenu(){
        System.out.println("Bienvenidos a mi primera version de Blackjack");
        System.out.println("1.- Empezar el juego");
        System.out.println("2.- Leer las reglas");
        System.out.println("3.- Salir del juego");
        return UI.readInt("Elige una opcion");
    }
    public static String StartingGame(){
        return UI.readString("");
    }
}