/*
 * This file is generated by jOOQ.
 */
package net.comerge.codingday.backend.database.models.backend;


import net.comerge.codingday.backend.database.models.DefaultCatalog;
import net.comerge.codingday.backend.database.models.backend.tables.MapUserToTeam;
import net.comerge.codingday.backend.database.models.backend.tables.News;
import net.comerge.codingday.backend.database.models.backend.tables.Team;
import net.comerge.codingday.backend.database.models.backend.tables.User;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
            "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Backend extends SchemaImpl {

    private static final long serialVersionUID = 1468351027;

    /**
     * The reference instance of <code>BACKEND</code>
     */
    public static final Backend BACKEND = new Backend();

    /**
     * The table <code>BACKEND.MAP_USER_TO_TEAM</code>.
     */
    public final MapUserToTeam MAP_USER_TO_TEAM = net.comerge.codingday.backend.database.models.backend.tables.MapUserToTeam.MAP_USER_TO_TEAM;

    /**
     * The table <code>BACKEND.NEWS</code>.
     */
    public final News NEWS = net.comerge.codingday.backend.database.models.backend.tables.News.NEWS;

    /**
     * The table <code>BACKEND.TEAM</code>.
     */
    public final Team TEAM = net.comerge.codingday.backend.database.models.backend.tables.Team.TEAM;

    /**
     * The table <code>BACKEND.USER</code>.
     */
    public final User USER = net.comerge.codingday.backend.database.models.backend.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Backend() {
        super("BACKEND", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            MapUserToTeam.MAP_USER_TO_TEAM,
            News.NEWS,
            Team.TEAM,
            User.USER);
    }
}
