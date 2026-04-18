package main.java.com.bibliotech.model;

public interface Resource { //esta creando con el () los metodos de acceso, que el record va a generar automaticamente por mi
    String isbn();
    String name();
    String autor();
    String category();
    int stock();
}
