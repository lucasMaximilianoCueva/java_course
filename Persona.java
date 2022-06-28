
public class Persona {
    private String name;
    private String lastName;

    public Persona(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
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
    public String toString() {
        return this.getName() + "  -  " + this.getLastName();
    }
}
