package net.comerge.codingday.backend.services;

import net.comerge.codingday.backend.database.models.backend.tables.User;
import net.comerge.codingday.backend.database.models.backend.tables.records.UserRecord;
import net.comerge.codingday.backend.dto.UserDTO;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final DSLContext context;

    public UserService(DSLContext context) {
        this.context = context;
    }

    public List<UserRecord> getAllUsers() {
        return context.select()
                .from(User.USER)
                .fetchInto(UserRecord.class);
    }

    public void createUser(UserDTO newUser) {
        // ...
    }
}
