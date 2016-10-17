package com.pitambar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Database utility class for all DAO classes.
 * 
 * @author Pitambar Mohanty
 */
public class DBUtil {
	/* The below Static block is used to one time load the driver class */
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(
					"Please put the oracle driver in classPath");
		}
	}
	/** Data source. */
	private DataSource dataSource;

	/** Initial context. */
	private InitialContext initialContext;

	/** Data source name. */
	private String dataSourceName;

	/** Database connect string. */
	private String dbConnectString;

	/**
	 * Constructor.
	 * 
	 * @paramdataSourceName JNDI name for the data source
	 */
	public DBUtil(final String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}

	/**
	 * Constructor.
	 * 
	 * @paramuserName - user name
	 * @param password
	 *            - password
	 * @param urlName
	 *            - DB url
	 */
	public DBUtil(final String userName, final String password,
			final String urlName) {
		dbConnectString = "jdbc:oracle:thin:" + userName + "/" + password + "@"
				+ urlName;
	}

	/**
	 * Gets a connection object from either from the data source or from the
	 * DriverManager.
	 * 
	 * @return DB connection
	 * 
	 * @throws SystemException
	 *             in case of any fatal error
	 */
	protected final Connection getConnection() throws Exception {
		Connection conn = null;

		try {
			if ((dataSourceName != null) && !dataSourceName.equals("")) {
				conn = getDataSource().getConnection();
			} else {

				conn = DriverManager.getConnection(dbConnectString);
			}
		} catch (NamingException exception) {
			throw new Exception("Failed to lookup connection datasource ("
					+ dataSourceName + ") because of " + exception);
		} catch (SQLException exception) {
			throw new Exception("Failed to get database connection ("
					+ dataSourceName + ") because of " + exception);
		}

		return conn;
	}

	/**
	 * Closes the reusltset object.
	 * 
	 * @param resultSet
	 * 
	 */
	protected final void close(final ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception ignore) {
			ignore.printStackTrace();
		}
	}

	/**
	 * Closes the statement object.
	 * 
	 * @param Statement
	 * 
	 */
	protected final void close(final Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception ignore) {
			ignore.printStackTrace();
		}
	}

	/**
	 * Closes the statement object and resultset object.
	 * 
	 * @param Statement
	 * @param ResultSet
	 * 
	 */
	protected final void close(final ResultSet rs, final Statement stmt) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception ignore) {
			ignore.printStackTrace();
		}
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception ignore) {
			ignore.printStackTrace();
		}
	}

	/**
	 * Closes the connection and statement objects.
	 * 
	 * @param conn
	 *            DB connection
	 * @paramstmt statement
	 */
	protected final void close(final Connection conn, final Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception ignore) {
		}

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception ignore) {
		}
	}

	/**
	 * Closes the connection,statement objects and resultSet objects .
	 * 
	 * @param conn
	 *            DB connection
	 * @param stmt
	 *            statement
	 * @param rs
	 *            ResultSet
	 */
	protected final void close(final Connection conn, final Statement stmt,
			final ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception ignore) {
		}

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception ignore) {
		}
	}

	/**
	 * Gets the data source.
	 * 
	 * @return data source
	 * 
	 * @throws NamingException
	 *             in case of any error while getting the data source from JNDI
	 *             tree
	 */
	private DataSource getDataSource() throws NamingException {
		if (dataSource == null) {
			InitialContext initCtx = getInitialContext();
			dataSource = (javax.sql.DataSource) initCtx.lookup(dataSourceName);
		}

		return dataSource;
	}

	/**
	 * Creates the context.
	 * 
	 * @return initial context
	 * 
	 * @throws NamingException
	 *             in case of any error while getting the context
	 */
	private InitialContext getInitialContext() throws NamingException {
		if (initialContext == null) {
			initialContext = new InitialContext();
		}

		return initialContext;
	}
}