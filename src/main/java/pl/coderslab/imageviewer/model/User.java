package pl.coderslab.imageviewer.model;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String name;
    private String password;

    public User(){

    }

    public User(int id, String name, String password){
        this.Id = id;
        this.name = name;
        this.password = password;
    }

    public int getId(){
        return Id;
    }

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
}
