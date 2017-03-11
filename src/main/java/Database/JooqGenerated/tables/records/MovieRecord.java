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
public class MovieRecord extends org.jooq.impl.UpdatableRecordImpl<Database.JooqGenerated.tables.records.MovieRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 535115230;

	/**
	 * Setter for <code>Movie.MID</code>.
	 */
	public void setMid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Movie.MID</code>.
	 */
	public java.lang.Integer getMid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Movie.Movie_name</code>.
	 */
	public void setMovieName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Movie.Movie_name</code>.
	 */
	public java.lang.String getMovieName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>Movie.Movie_type</code>.
	 */
	public void setMovieType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Movie.Movie_type</code>.
	 */
	public java.lang.String getMovieType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Movie.Movie_date</code>.
	 */
	public void setMovieDate(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Movie.Movie_date</code>.
	 */
	public java.lang.Integer getMovieDate() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>Movie.Movie_class</code>.
	 */
	public void setMovieClass(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>Movie.Movie_class</code>.
	 */
	public java.lang.String getMovieClass() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>Movie.Movie_lang</code>.
	 */
	public void setMovieLang(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>Movie.Movie_lang</code>.
	 */
	public java.lang.String getMovieLang() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>Movie.Movie_length</code>.
	 */
	public void setMovieLength(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>Movie.Movie_length</code>.
	 */
	public java.lang.Integer getMovieLength() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>Movie.Movie_director</code>.
	 */
	public void setMovieDirector(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>Movie.Movie_director</code>.
	 */
	public java.lang.String getMovieDirector() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>Movie.Movie_cast</code>.
	 */
	public void setMovieCast(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>Movie.Movie_cast</code>.
	 */
	public java.lang.String getMovieCast() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>Movie.Movie_location</code>.
	 */
	public void setMovieLocation(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>Movie.Movie_location</code>.
	 */
	public java.lang.String getMovieLocation() {
		return (java.lang.String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_CLASS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_LANG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_DIRECTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_CAST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return Database.JooqGenerated.tables.Movie.MOVIE.MOVIE_LOCATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getMid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getMovieName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getMovieType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getMovieDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getMovieClass();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getMovieLang();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getMovieLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getMovieDirector();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getMovieCast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getMovieLocation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value1(java.lang.Integer value) {
		setMid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value2(java.lang.String value) {
		setMovieName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value3(java.lang.String value) {
		setMovieType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value4(java.lang.Integer value) {
		setMovieDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value5(java.lang.String value) {
		setMovieClass(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value6(java.lang.String value) {
		setMovieLang(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value7(java.lang.Integer value) {
		setMovieLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value8(java.lang.String value) {
		setMovieDirector(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value9(java.lang.String value) {
		setMovieCast(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value10(java.lang.String value) {
		setMovieLocation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4, java.lang.String value5, java.lang.String value6, java.lang.Integer value7, java.lang.String value8, java.lang.String value9, java.lang.String value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MovieRecord
	 */
	public MovieRecord() {
		super(Database.JooqGenerated.tables.Movie.MOVIE);
	}

	/**
	 * Create a detached, initialised MovieRecord
	 */
	public MovieRecord(java.lang.Integer mid, java.lang.String movieName, java.lang.String movieType, java.lang.Integer movieDate, java.lang.String movieClass, java.lang.String movieLang, java.lang.Integer movieLength, java.lang.String movieDirector, java.lang.String movieCast, java.lang.String movieLocation) {
		super(Database.JooqGenerated.tables.Movie.MOVIE);

		setValue(0, mid);
		setValue(1, movieName);
		setValue(2, movieType);
		setValue(3, movieDate);
		setValue(4, movieClass);
		setValue(5, movieLang);
		setValue(6, movieLength);
		setValue(7, movieDirector);
		setValue(8, movieCast);
		setValue(9, movieLocation);
	}
}
