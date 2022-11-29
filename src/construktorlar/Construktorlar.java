/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package construktorlar;

/**
 *
 * @author Umman
 */
public class Construktorlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        User u = new User(); // construktor cagirilmasi ucun yazilan kod
//        
//        u.setName("Umman");
// 
//        System.out.println(u.getName());
//        System.out.println(u.getSurname());
//        System.out.println(u.getAge());
// burada bitir. ozum koment etmisem kod qarismasin.
//        User u = new User("Umman", "Hasanov", 34);
//        System.out.println(u.getName());
        User u = new User();

        foo();// pause 

    }

    public static void foo() {
        foo2(); // pause foo2()  gozleyir,  foo2()den sonra icra olunur
        System.out.println("foo");
    }

    public static void foo2() {
        foo3();// pause foo3()  gozleyir, foo3()den sonra icra olunur
        System.out.println("foo2");
    }

    public static void foo3() {// foo3() icra olunur
        System.out.println("foo3");
    }

}
