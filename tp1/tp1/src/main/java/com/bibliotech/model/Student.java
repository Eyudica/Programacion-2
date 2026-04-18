package main.java.com.bibliotech.model;

public class Student extends Customer {
    public Student(String dni, String name, String email){
        super(dni,name,email);
    }
    @Override
    public int getMaxLimit(){
        return 3;
    }
}
