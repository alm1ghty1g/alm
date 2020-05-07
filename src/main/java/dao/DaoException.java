package dao;

import java.sql.SQLException;

public class DaoException extends SQLException {
    public DaoException(String reason, String SQLState, int vendorCode) {
        super(reason, SQLState, vendorCode);
    }

    public DaoException(String reason, String SQLState) {
        super(reason, SQLState);
    }

    public DaoException(String reason) {
        super(reason);
    }

    public DaoException() {
        super();
    }
}
