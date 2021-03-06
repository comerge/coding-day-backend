/*
 * This file is generated by jOOQ.
 */
package net.comerge.codingday.backend.database.models.backend;


import net.comerge.codingday.backend.database.models.backend.tables.MapUserToTeam;
import net.comerge.codingday.backend.database.models.backend.tables.News;
import net.comerge.codingday.backend.database.models.backend.tables.Team;
import net.comerge.codingday.backend.database.models.backend.tables.User;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling indexes of tables of the <code>BACKEND</code> schema.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CONSTRAINT_INDEX_5 = Indexes0.CONSTRAINT_INDEX_5;
    public static final Index CONSTRAINT_INDEX_5F = Indexes0.CONSTRAINT_INDEX_5F;
    public static final Index CONSTRAINT_INDEX_2 = Indexes0.CONSTRAINT_INDEX_2;
    public static final Index PRIMARY_KEY_24 = Indexes0.PRIMARY_KEY_24;
    public static final Index PRIMARY_KEY_27 = Indexes0.PRIMARY_KEY_27;
    public static final Index PRIMARY_KEY_2 = Indexes0.PRIMARY_KEY_2;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CONSTRAINT_INDEX_5 = Internal.createIndex("CONSTRAINT_INDEX_5", MapUserToTeam.MAP_USER_TO_TEAM, new OrderField[]{MapUserToTeam.MAP_USER_TO_TEAM.USER}, false);
        public static Index CONSTRAINT_INDEX_5F = Internal.createIndex("CONSTRAINT_INDEX_5F", MapUserToTeam.MAP_USER_TO_TEAM, new OrderField[]{MapUserToTeam.MAP_USER_TO_TEAM.TEAM}, false);
        public static Index CONSTRAINT_INDEX_2 = Internal.createIndex("CONSTRAINT_INDEX_2", News.NEWS, new OrderField[]{News.NEWS.AUTHOR}, false);
        public static Index PRIMARY_KEY_24 = Internal.createIndex("PRIMARY_KEY_24", News.NEWS, new OrderField[]{News.NEWS.ID}, true);
        public static Index PRIMARY_KEY_27 = Internal.createIndex("PRIMARY_KEY_27", Team.TEAM, new OrderField[]{Team.TEAM.ID}, true);
        public static Index PRIMARY_KEY_2 = Internal.createIndex("PRIMARY_KEY_2", User.USER, new OrderField[]{User.USER.ID}, true);
    }
}
