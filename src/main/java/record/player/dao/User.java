package record.player.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import record.player.impl.UserBuilder;
import record.player.impl.UserBuilderImpl;

import javax.persistence.*;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME")
    private String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {

    }


    public void print() {
        System.out.println(String.format("USER: id=%s, name=%s, ", id, name));
    }

    public static void main(String[] args) {
        User user = new UserBuilderImpl()
                .setID(12L)
                .setName("Ivanov Ivan Ivanovich").build();
        user.print();

    }
}
