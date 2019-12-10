/*
 * This file is generated by jOOQ.
 */
package net.comerge.codingday.backend.database.models.backend.tables;


import net.comerge.codingday.backend.database.models.backend.Backend;
import net.comerge.codingday.backend.database.models.backend.Indexes;
import net.comerge.codingday.backend.database.models.backend.Keys;
import net.comerge.codingday.backend.database.models.backend.tables.records.MapUserToTeamRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class MapUserToTeam extends TableImpl<MapUserToTeamRecord> {

    private static final long serialVersionUID = -346995299;

    /**
     * The reference instance of <code>BACKEND.MAP_USER_TO_TEAM</code>
     */
    public static final MapUserToTeam MAP_USER_TO_TEAM = new MapUserToTeam();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapUserToTeamRecord> getRecordType() {
        return MapUserToTeamRecord.class;
    }

    /**
     * The column <code>BACKEND.MAP_USER_TO_TEAM.USER</code>.
     */
    public final TableField<MapUserToTeamRecord, Long> USER = createField(DSL.name("USER"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>BACKEND.MAP_USER_TO_TEAM.TEAM</code>.
     */
    public final TableField<MapUserToTeamRecord, Long> TEAM = createField(DSL.name("TEAM"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>BACKEND.MAP_USER_TO_TEAM</code> table reference
     */
    public MapUserToTeam() {
        this(DSL.name("MAP_USER_TO_TEAM"), null);
    }

    /**
     * Create an aliased <code>BACKEND.MAP_USER_TO_TEAM</code> table reference
     */
    public MapUserToTeam(String alias) {
        this(DSL.name(alias), MAP_USER_TO_TEAM);
    }

    /**
     * Create an aliased <code>BACKEND.MAP_USER_TO_TEAM</code> table reference
     */
    public MapUserToTeam(Name alias) {
        this(alias, MAP_USER_TO_TEAM);
    }

    private MapUserToTeam(Name alias, Table<MapUserToTeamRecord> aliased) {
        this(alias, aliased, null);
    }

    private MapUserToTeam(Name alias, Table<MapUserToTeamRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MapUserToTeam(Table<O> child, ForeignKey<O, MapUserToTeamRecord> key) {
        super(child, key, MAP_USER_TO_TEAM);
    }

    @Override
    public Schema getSchema() {
        return Backend.BACKEND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_5, Indexes.CONSTRAINT_INDEX_5F);
    }

    @Override
    public List<ForeignKey<MapUserToTeamRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MapUserToTeamRecord, ?>>asList(Keys.CONSTRAINT_5, Keys.CONSTRAINT_5F);
    }

    public User user() {
        return new User(this, Keys.CONSTRAINT_5);
    }

    public Team team() {
        return new Team(this, Keys.CONSTRAINT_5F);
    }

    @Override
    public MapUserToTeam as(String alias) {
        return new MapUserToTeam(DSL.name(alias), this);
    }

    @Override
    public MapUserToTeam as(Name alias) {
        return new MapUserToTeam(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MapUserToTeam rename(String name) {
        return new MapUserToTeam(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MapUserToTeam rename(Name name) {
        return new MapUserToTeam(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
