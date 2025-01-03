package models;

public class Circle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String setNameAndReturn(String name) {
        this.name = name;
        return "Returning string from setter.";
    }
    public String setNameAndThrowingException(String name) {
        this.name = name;
        throw new RuntimeException();
    }
    private String name;
}
