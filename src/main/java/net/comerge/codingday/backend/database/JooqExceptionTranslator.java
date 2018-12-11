package net.comerge.codingday.backend.database;

import java.sql.SQLException;
import javax.annotation.PostConstruct;

import org.jooq.exception.DataAccessException;

import org.springframework.jdbc.support.SQLStateSQLExceptionTranslator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class JooqExceptionTranslator {

    private SQLStateSQLExceptionTranslator translator;

    @PostConstruct
    public void init() {
        translator = new SQLStateSQLExceptionTranslator();
    }

    /**
     * Translates an exception thrown by Jooq, which is usually a {@link SQLException},
     * into Spring framework exception.
     * <p>
     * It returns the original exception if the given exception could not be translated.
     *
     * @param e
     * @return the translated exception or the original exception
     */
    public Exception translate(DataAccessException e) {
        try {
            return translator.translate(null, null, (SQLException) e.getCause());
        } catch (ClassCastException ex) {
            return e;
        }
    }
}
