package fidelitasvirtual.org.models;

public class Client extends User {
    private char clientType;

    public Client(int id, String name, int age, String idDocument, char clientType) {
        super(id, name, age, idDocument);
        this.clientType = clientType;
    }

    public char getClientType() {
        return clientType;
    }
    public void setClientType(char clientType) {
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "Client [id=" + this.getId() + ", name=" + this.getName() + " age=" + this.getAge() + ", idDocument=" + this.getIdDocument() + ", clientType=" + this.getClientType() + "]";
    }
}
