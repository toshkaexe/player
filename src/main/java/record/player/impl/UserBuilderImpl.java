package record.player.impl;

import record.player.dao.User;

public class UserBuilderImpl implements UserBuilder {
    private long id;
    private String name;
    User person = new User();
    @Override
    public UserBuilder setName(String name) {
        person.name= name;
        return this;
    }

    @Override
    public UserBuilder setID(Long id) {
        person.id = id;
        return this;
    }


    @Override
    public User build() {
        return new User(id, name);
    }
}
