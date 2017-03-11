/*
 * This file is generated by jOOQ.
*/
package Database.JooqGenerated;


import Database.JooqGenerated.tables.Customer;
import Database.JooqGenerated.tables.Movie;
import Database.JooqGenerated.tables.SqliteSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = -1392357467;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>Customer</code>.
     */
    public final Customer CUSTOMER = Database.JooqGenerated.tables.Customer.CUSTOMER;

    /**
     * The table <code>Movie</code>.
     */
    public final Movie MOVIE = Database.JooqGenerated.tables.Movie.MOVIE;

    /**
     * The table <code>sqlite_sequence</code>.
     */
    public final SqliteSequence SQLITE_SEQUENCE = Database.JooqGenerated.tables.SqliteSequence.SQLITE_SEQUENCE;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    /**
     * {@inheritDoc}
     */
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
            Customer.CUSTOMER,
            Movie.MOVIE,
            SqliteSequence.SQLITE_SEQUENCE);
    }
}