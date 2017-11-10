package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ItemsService {

    public static void selectAll(List<Items> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT ItemID, ItemIMG, ItemName, ItemDescription, SellingPrice, BuyingPrice, Groups, Quantity, ItemIMG FROM Items ORDER BY ItemID");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Items(results.getInt("ItemID"), results.getString("ItemName"), results.getString("ItemDescription"), results.getDouble("SellingPrice"), results.getDouble("BuyingPrice"), results.getString("Groups"), results.getInt("Quantity"), results.getBlob("ItemIMG")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

   /* public static Items selectById(int id, DatabaseConnection database) {

        Items result = null;

        PreparedStatement statement = database.newStatement("SELECT x, y, z FROM Table WHERE id = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Items(results.getInt("x"), results.getString("y"), results.getString("z"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }*/


    }

