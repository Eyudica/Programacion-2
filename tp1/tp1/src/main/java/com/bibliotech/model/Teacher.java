package main.java.com.bibliotech.model;

public class Teacher extends Customer {
    public Teacher(String dni, String name, String email){
        super(dni,name,email);
    }
    @Override
    public int getMaxLimit(){
        return 5;
    }
}
