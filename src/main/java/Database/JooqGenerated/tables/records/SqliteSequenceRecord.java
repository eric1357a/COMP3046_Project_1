/**
 * This class is generated by jOOQ
 */
package Database.JooqGenerated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SqliteSequenceRecord extends org.jooq.impl.TableRecordImpl<Database.JooqGenerated.tables.records.SqliteSequenceRecord> implements org.jooq.Record2<java.lang.Object, java.lang.Object> {

	private static final long serialVersionUID = 1731521921;

	/**
	 * Setter for <code>sqlite_sequence.name</code>.
	 */
	public void setName(java.lang.Object value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sqlite_sequence.name</code>.
	 */
	public java.lang.Object getName() {
		return (java.lang.Object) getValue(0);
	}

	/**
	 * Setter for <code>sqlite_sequence.seq</code>.
	 */
	public void setSeq(java.lang.Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sqlite_sequence.seq</code>.
	 */
	public java.lang.Object getSeq() {
		return (java.lang.Object) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Object, java.lang.Object> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Object, java.lang.Object> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field1() {
		return Database.JooqGenerated.tables.SqliteSequence.SQLITE_SEQUENCE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field2() {
		return Database.JooqGenerated.tables.SqliteSequence.SQLITE_SEQUENCE.SEQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value2() {
		return getSeq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SqliteSequenceRecord value1(java.lang.Object value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SqliteSequenceRecord value2(java.lang.Object value) {
		setSeq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SqliteSequenceRecord values(java.lang.Object value1, java.lang.Object value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SqliteSequenceRecord
	 */
	public SqliteSequenceRecord() {
		super(Database.JooqGenerated.tables.SqliteSequence.SQLITE_SEQUENCE);
	}

	/**
	 * Create a detached, initialised SqliteSequenceRecord
	 */
	public SqliteSequenceRecord(java.lang.Object name, java.lang.Object seq) {
		super(Database.JooqGenerated.tables.SqliteSequence.SQLITE_SEQUENCE);

		setValue(0, name);
		setValue(1, seq);
	}
}
