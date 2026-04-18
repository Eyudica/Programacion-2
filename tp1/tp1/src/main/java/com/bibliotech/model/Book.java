package main.java.com.bibliotech.model;

public record Book(String isbn, String name, String autor, String category,int stock) implements Resource{

    public Book withUpdatedStock(int newStock){
        return new Book(this.isbn,this.name,this.autor,this.category,newStock);
    }
}
