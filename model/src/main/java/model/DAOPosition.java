package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Position;

public class DAOPosition extends DAOEntity<Position> {

    public DAOPosition(final Connection connection) throws SQLException {
        super(connection);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean create(final Position entity) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(final Position entity) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<Position> find(final int id) {
        final ArrayList<Position> P = new ArrayList<Position>();

        try {
            final String sql = "{call getMap(?)}";
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setInt(1, id);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            while (resultSet.next()) {
                P.add(new Position(resultSet.getInt("ID_type_elements"), resultSet.getInt("X"), resultSet.getInt("Y")));
            }
            return P;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Position find(final String label) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean update(final Position entity) {
        // TODO Auto-generated method stub
        return false;
    }

}
