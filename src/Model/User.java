package Model;

import java.util.ArrayList;

public class User {
    String Username;
    String contact_no;

    ArrayList<items>items;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public ArrayList<Model.items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Model.items> items) {
        this.items = items;
    }

    public User(String username, String contact_no, ArrayList<Model.items> items) {
        Username = username;
        this.contact_no = contact_no;
        this.items = items;
    }
}
