package reScheduleServer.Objects;

import javax.persistence.*;

@Entity(name="Account")
@Table(name="accounts")
public class Account {

    @Column(name="username")
    private String username;

    @GeneratedValue
    @Id
    @Column(name="account_id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
