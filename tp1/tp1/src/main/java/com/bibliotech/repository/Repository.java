package main.java.com.bibliotech.repository;

public interface Repository<T, ID> {
    void save(T entity); //Recibe un objeto y lo guarda en el sistema de almacenamiento.
    Optional<T> searchById(ID id);
    Optional<T> searchByName(Name name);
    List<T> searchAll();
}

//T=type         ID=identifier