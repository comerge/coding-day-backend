/*
 * This file is generated by jOOQ.
 */
package net.comerge.codingday.backend.database.models.backend;


import net.comerge.codingday.backend.database.models.backend.tables.MapUserToTeam;
import net.comerge.codingday.backend.database.models.backend.tables.News;
import net.comerge.codingday.backend.database.models.backend.tables.Team;
import net.comerge.codingday.backend.database.models.backend.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in BACKEND
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>BACKEND.MAP_USER_TO_TEAM</code>.
     */
    public static final MapUserToTeam MAP_USER_TO_TEAM = MapUserToTeam.MAP_USER_TO_TEAM;

    /**
     * The table <code>BACKEND.NEWS</code>.
     */
    public static final News NEWS = News.NEWS;

    /**
     * The table <code>BACKEND.TEAM</code>.
     */
    public static final Team TEAM = Team.TEAM;

    /**
     * The table <code>BACKEND.USER</code>.
     */
    public static final User USER = User.USER;
}
