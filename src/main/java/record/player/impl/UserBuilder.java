package record.player.impl;

import record.player.dao.User;

public interface UserBuilder {
    UserBuilder setName(String name);
    UserBuilder setID(Long id);
    User build();
}
