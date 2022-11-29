/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construktorlar;

/**
 *
 * @author Umman
 */
public class User {

    private String name;
    private String surname;
    private int age;

    public User() { // parametrsiz  Constructor
        this("Umman", "Hasanov");
        System.out.println("User1");
        this.name = "name is undefined";
        this.surname = "surname is undefined";
        this.age = -1;
    }

    public User(String name, String surname) { // parametrli  Constructor
        this("Umman", "Hasanov", 34);
        System.out.println("User2");
        this.name = name;
        this.surname = surname;

    }

    public User(String name, String surname, int age) { // parametrli  Constructor
        System.out.println("User3");
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
