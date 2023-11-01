package record.player.impl;

import record.player.dao.User;

public class UserBuilderImpl implements UserBuilder {
    User person = new User();
    @Override
    public UserBuilder setName(String name) {
        person.name= name;
        return this;
    }

    @Override
    public User build() {
        return null;
    }
}
