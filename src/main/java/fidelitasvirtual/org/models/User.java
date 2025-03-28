package fidelitasvirtual.org.models;

public class User {
    private final int id;
    private String name;
    private int age;
    private String idDocument;

    public User(int id, String name, int age, String idDocument) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.idDocument = idDocument;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getIdDocument() {
        return idDocument;
    }
    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }
    public int getId() {
        return id;
    }
}
