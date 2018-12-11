/*
 * This file is generated by jOOQ.
*/
package net.comerge.codingday.backend.database.models.backend;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import net.comerge.codingday.backend.database.models.backend.tables.MapUserToTeam;
import net.comerge.codingday.backend.database.models.backend.tables.News;
import net.comerge.codingday.backend.database.models.backend.tables.Team;
import net.comerge.codingday.backend.database.models.backend.tables.User;
import net.comerge.codingday.backend.database.models.backend.tables.records.MapUserToTeamRecord;
import net.comerge.codingday.backend.database.models.backend.tables.records.NewsRecord;
import net.comerge.codingday.backend.database.models.backend.tables.records.TeamRecord;
import net.comerge.codingday.backend.database.models.backend.tables.records.UserRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>BACKEND</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<NewsRecord, Long> IDENTITY_NEWS = Identities0.IDENTITY_NEWS;
    public static final Identity<TeamRecord, Long> IDENTITY_TEAM = Identities0.IDENTITY_TEAM;
    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<NewsRecord> CONSTRAINT_24 = UniqueKeys0.CONSTRAINT_24;
    public static final UniqueKey<TeamRecord> CONSTRAINT_27 = UniqueKeys0.CONSTRAINT_27;
    public static final UniqueKey<UserRecord> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<MapUserToTeamRecord, UserRecord> CONSTRAINT_5 = ForeignKeys0.CONSTRAINT_5;
    public static final ForeignKey<MapUserToTeamRecord, TeamRecord> CONSTRAINT_5F = ForeignKeys0.CONSTRAINT_5F;
    public static final ForeignKey<NewsRecord, UserRecord> CONSTRAINT_248 = ForeignKeys0.CONSTRAINT_248;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<NewsRecord, Long> IDENTITY_NEWS = createIdentity(News.NEWS, News.NEWS.ID);
        public static Identity<TeamRecord, Long> IDENTITY_TEAM = createIdentity(Team.TEAM, Team.TEAM.ID);
        public static Identity<UserRecord, Long> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<NewsRecord> CONSTRAINT_24 = createUniqueKey(News.NEWS, "CONSTRAINT_24", News.NEWS.ID);
        public static final UniqueKey<TeamRecord> CONSTRAINT_27 = createUniqueKey(Team.TEAM, "CONSTRAINT_27", Team.TEAM.ID);
        public static final UniqueKey<UserRecord> CONSTRAINT_2 = createUniqueKey(User.USER, "CONSTRAINT_2", User.USER.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<MapUserToTeamRecord, UserRecord> CONSTRAINT_5 = createForeignKey(net.comerge.codingday.backend.database.models.backend.Keys.CONSTRAINT_2, MapUserToTeam.MAP_USER_TO_TEAM, "CONSTRAINT_5", MapUserToTeam.MAP_USER_TO_TEAM.USER);
        public static final ForeignKey<MapUserToTeamRecord, TeamRecord> CONSTRAINT_5F = createForeignKey(net.comerge.codingday.backend.database.models.backend.Keys.CONSTRAINT_27, MapUserToTeam.MAP_USER_TO_TEAM, "CONSTRAINT_5F", MapUserToTeam.MAP_USER_TO_TEAM.TEAM);
        public static final ForeignKey<NewsRecord, UserRecord> CONSTRAINT_248 = createForeignKey(net.comerge.codingday.backend.database.models.backend.Keys.CONSTRAINT_2, News.NEWS, "CONSTRAINT_248", News.NEWS.AUTHOR);
    }
}