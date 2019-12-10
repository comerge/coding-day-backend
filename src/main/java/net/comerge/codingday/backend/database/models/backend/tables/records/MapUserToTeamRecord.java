/*
 * This file is generated by jOOQ.
 */
package net.comerge.codingday.backend.database.models.backend.tables.records;


import net.comerge.codingday.backend.database.models.backend.tables.MapUserToTeam;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;


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
public class MapUserToTeamRecord extends TableRecordImpl<MapUserToTeamRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -1637041652;

    /**
     * Setter for <code>BACKEND.MAP_USER_TO_TEAM.USER</code>.
     */
    public void setUser(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>BACKEND.MAP_USER_TO_TEAM.USER</code>.
     */
    public Long getUser() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>BACKEND.MAP_USER_TO_TEAM.TEAM</code>.
     */
    public void setTeam(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>BACKEND.MAP_USER_TO_TEAM.TEAM</code>.
     */
    public Long getTeam() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MapUserToTeam.MAP_USER_TO_TEAM.USER;
    }

    @Override
    public Field<Long> field2() {
        return MapUserToTeam.MAP_USER_TO_TEAM.TEAM;
    }

    @Override
    public Long component1() {
        return getUser();
    }

    @Override
    public Long component2() {
        return getTeam();
    }

    @Override
    public Long value1() {
        return getUser();
    }

    @Override
    public Long value2() {
        return getTeam();
    }

    @Override
    public MapUserToTeamRecord value1(Long value) {
        setUser(value);
        return this;
    }

    @Override
    public MapUserToTeamRecord value2(Long value) {
        setTeam(value);
        return this;
    }

    @Override
    public MapUserToTeamRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapUserToTeamRecord
     */
    public MapUserToTeamRecord() {
        super(MapUserToTeam.MAP_USER_TO_TEAM);
    }

    /**
     * Create a detached, initialised MapUserToTeamRecord
     */
    public MapUserToTeamRecord(Long user, Long team) {
        super(MapUserToTeam.MAP_USER_TO_TEAM);

        set(0, user);
        set(1, team);
    }
}
