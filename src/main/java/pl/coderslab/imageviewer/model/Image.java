package pl.coderslab.imageviewer.model;


import javax.persistence.*;
import java.util.Base64;


@Entity
@Table(name="Images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
@Lob
@Column(columnDefinition = "LONGBLOB")
    private byte[] image;
    private String title;
    private String description;



    public Image(){
    }

    public Image(int id, byte[] image, String title, String description){
        this.Id = id;
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public Image(byte[] image, String title, String description){
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getId(){
        return Id;
    }

    public String getImage(){
        return Base64.getEncoder().encodeToString(image);
    }


    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

}