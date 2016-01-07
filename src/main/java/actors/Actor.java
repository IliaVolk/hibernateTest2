package actors;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by user on 04.01.2016.
 */
@Entity
@Table(name = "actor")
public class Actor {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name= "birthday")
    @Temporal(value= TemporalType.DATE)
    private Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
