package net.comerge.codingday.backend.services;

import java.util.List;

import org.jooq.DSLContext;

import net.comerge.codingday.backend.database.models.backend.tables.User;
import net.comerge.codingday.backend.database.models.backend.tables.records.UserRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private DSLContext context;

    public List<UserRecord> getAllUsers() {
        return context.select()
                .from(User.USER)
                .fetchInto(UserRecord.class);
    }
}
