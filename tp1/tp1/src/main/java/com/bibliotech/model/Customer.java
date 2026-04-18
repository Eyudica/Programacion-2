package main.java.com.bibliotech.model;
import java.util.List;
import java.util.ArrayList;

public abstract class Customer {
    private final String dni;
    private final String name;
    private final String email;
    private List<Resource> activeLoans; // Lista mutable

    public Customer(String dni, String name, String email) {
        this.dni = dni;
        this.name = name;
        this.email = email;
        this.activeLoans = new ArrayList<>();
    }

    public abstract int getMaxLimit();

    public boolean canRequestMoreResources() {
        return activeLoans.size() < getMaxLimit();
    }

    public String getDni() {
        return dni;
    }
    public List<Resource> getActiveLoans() {
        return activeLoans;
    }
}