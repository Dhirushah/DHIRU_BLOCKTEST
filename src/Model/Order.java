package Model;

import java.util.ArrayList;

public class Order {
    ArrayList<User> User;

    public ArrayList<Model.User> getUser() {
        return User;
    }

    public void setUser(ArrayList<Model.User> user) {
        User = user;
    }

    public Order(ArrayList<Model.User> user) {
        User = user;
    }
}
