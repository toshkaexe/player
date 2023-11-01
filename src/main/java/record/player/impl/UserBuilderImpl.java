package record.player.impl;

import record.player.dao.User;

public class UserBuilderImpl implements UserBuilder {
    private long id;
    private String name;
    @Override
    public UserBuilderImpl setName(String name) {
        this.name= name;
        return this;
    }

    @Override
    public UserBuilderImpl setID(long id) {
        this.id = id;
        return this;
    }


    @Override
    public User build() {

        return new User(id, name);
    }
}
