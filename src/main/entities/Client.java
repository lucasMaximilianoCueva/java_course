package main.entities;

import java.util.Objects;

public class Client {
    private int dni;
    private String name;
    private String lastName;

    public Client(int dni, String name, String lastName){
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.lastName = dni;
    }

    public int getDni() {
        return this.dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(dni, client.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return this.getName() + "  -  " + this.getLastName();
    }
}
