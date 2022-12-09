package Model;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        items one = new items("nerd", "Nerd", 1200, 001);
        items two = new items("unique", "erd", 1200, 002);
        items three = new items("tory", "troy", 1300, 003);
        items four = new items("ishirt", "shika", 1500, 004);
        items five = new items("sup", "supreme", 2500, 005);

       one.print();


        ArrayList<items>mylist = new ArrayList<items>();

        mylist.add(one);
        mylist.add(two);
        ArrayList<items>mylist1= new ArrayList<items>();
        mylist1.add(three);
        mylist1.add(four);
        mylist1.add(five);

        User U1=new User("dhiru","23423423",mylist);
        User U2= new User("asug","723t6488",mylist1);
        ArrayList<User> Userlist=new ArrayList<User>();
        Userlist.add(U1);
        Userlist.add(U2);

    }
}

