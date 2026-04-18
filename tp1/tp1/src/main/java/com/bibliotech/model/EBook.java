package main.java.com.bibliotech.model;

public record EBook(String isbn, String name, String autor, String category,String format) implements Resource {

    @Override
    public int stock(){
        return 999;
    }

}
