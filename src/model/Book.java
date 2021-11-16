package model;

/**
 *
 * @author cazamora
 */
public class Book {

    private Integer code;
    private String gender;
    private String name;
    private String author;
    private Integer year;
    private String state;
    private static int secuential;

    public Book() {
    }

    public Book(String gender, String name, String author, int year) {
        this.code = ++secuential;
        this.gender = gender;
        this.name = name;
        this.author = author;
        this. year = year;
        this.state = BookStatus.ACTIVE.getState();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void ActivateBook() {
        state = "Activo";
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }


    @Override
    public String toString() {
        return "CODIGO: " + this.code+ " Genero: " + this.gender + "  NOMBRE: " + this.name + " AUTOR: " + this.author + " AÑO: " + this.year + " ESTADO: " + this.state;
    }

}
