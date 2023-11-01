package record.player.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="USERS")
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "NAME")
    public String name;

    public void print(){
        System.out.println(String.format("USER: id=%s, name=%s, ", id, name);
    }

}
