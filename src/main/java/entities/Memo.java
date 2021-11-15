package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Memo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
