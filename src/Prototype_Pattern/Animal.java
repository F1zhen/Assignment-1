package Prototype_Pattern;

public class Animal implements Cloneable{
    private String name;
    private String color;

    private String type;

    public Animal(String name, String color, String type){
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public Animal clone(){
        return new Animal(this.name, this.color, this.type);
    }

    public String getName(String name){
        return name;
    }

    public String getColor(String color){
        return color;
    }

    public String getType (String type){
        return type;
    }

    public String toString() {
        return "name='" + name + "', color=" + color + "', type=" + type + "' ";
    }
}