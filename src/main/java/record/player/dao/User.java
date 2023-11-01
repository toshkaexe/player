package record.player.dao;

import lombok.Getter;
import lombok.Setter;
import record.player.impl.UserBuilder;
import record.player.impl.UserBuilderImpl;

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
    public long id;
    @Column(name = "NAME")
    public String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {

    }


    public void print(){
        System.out.println(String.format("USER: id=%s, name=%s, ", id, name));
    }

    public static void main(String[] args){
        User user = new UserBuilderImpl()
                .setID(12L)
                .setName("Ivanov Ivan Ivanovich").build();
        user.print();

    }
}
