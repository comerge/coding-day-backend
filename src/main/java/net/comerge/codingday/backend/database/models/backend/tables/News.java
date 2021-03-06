/*
 * This file is generated by jOOQ.
 */
package net.comerge.codingday.backend.database.models.backend.tables;


import net.comerge.codingday.backend.database.models.backend.Backend;
import net.comerge.codingday.backend.database.models.backend.Indexes;
import net.comerge.codingday.backend.database.models.backend.Keys;
import net.comerge.codingday.backend.database.models.backend.tables.records.NewsRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
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
public class News extends TableImpl<NewsRecord> {

    private static final long serialVersionUID = 1568557287;

    /**
     * The reference instance of <code>BACKEND.NEWS</code>
     */
    public static final News NEWS = new News();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NewsRecord> getRecordType() {
        return NewsRecord.class;
    }

    /**
     * The column <code>BACKEND.NEWS.ID</code>.
     */
    public final TableField<NewsRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>BACKEND.NEWS.CREATED_AT</code>.
     */
    public final TableField<NewsRecord, Timestamp> CREATED_AT = createField(DSL.name("CREATED_AT"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(6).nullable(false), this, "");

    /**
     * The column <code>BACKEND.NEWS.AUTHOR</code>.
     */
    public final TableField<NewsRecord, Long> AUTHOR = createField(DSL.name("AUTHOR"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>BACKEND.NEWS.TITLE</code>.
     */
    public final TableField<NewsRecord, String> TITLE = createField(DSL.name("TITLE"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>BACKEND.NEWS.MESSAGE</code>.
     */
    public final TableField<NewsRecord, String> MESSAGE = createField(DSL.name("MESSAGE"), org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * Create a <code>BACKEND.NEWS</code> table reference
     */
    public News() {
        this(DSL.name("NEWS"), null);
    }

    /**
     * Create an aliased <code>BACKEND.NEWS</code> table reference
     */
    public News(String alias) {
        this(DSL.name(alias), NEWS);
    }

    /**
     * Create an aliased <code>BACKEND.NEWS</code> table reference
     */
    public News(Name alias) {
        this(alias, NEWS);
    }

    private News(Name alias, Table<NewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private News(Name alias, Table<NewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> News(Table<O> child, ForeignKey<O, NewsRecord> key) {
        super(child, key, NEWS);
    }

    @Override
    public Schema getSchema() {
        return Backend.BACKEND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_2, Indexes.PRIMARY_KEY_24);
    }

    @Override
    public Identity<NewsRecord, Long> getIdentity() {
        return Keys.IDENTITY_NEWS;
    }

    @Override
    public UniqueKey<NewsRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_24;
    }

    @Override
    public List<UniqueKey<NewsRecord>> getKeys() {
        return Arrays.<UniqueKey<NewsRecord>>asList(Keys.CONSTRAINT_24);
    }

    @Override
    public List<ForeignKey<NewsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NewsRecord, ?>>asList(Keys.CONSTRAINT_248);
    }

    public User user() {
        return new User(this, Keys.CONSTRAINT_248);
    }

    @Override
    public News as(String alias) {
        return new News(DSL.name(alias), this);
    }

    @Override
    public News as(Name alias) {
        return new News(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public News rename(String name) {
        return new News(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public News rename(Name name) {
        return new News(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Timestamp, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
