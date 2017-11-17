package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ItemsService {
    public static void selectAll(List<Items> targetList, DatabaseConnection itemsDatabase) {

        PreparedStatement statement = itemsDatabase.newStatement("SELECT ItemID, ItemIMG, ItemName, ItemDescription, SellingPrice, BuyingPrice, Groups, Quantity, ItemIMG FROM Items ORDER BY ItemID");

        try {
            if (statement != null) {

                ResultSet results = itemsDatabase.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Items(results.getInt("ItemID"), results.getString("ItemName"), results.getString("ItemDescription"), results.getDouble("SellingPrice"), results.getDouble("BuyingPrice"), results.getString("Groups"), results.getInt("Quantity"), results.getString("itemIMG")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

    public static Items selectById(int id, DatabaseConnection itemDatabase) {

        Items result = null;

        PreparedStatement statement = itemDatabase.newStatement("SELECT itemID, itemName, ItemDescription, sellingPrice, buyingPrice, groups, quantity, itemIMG FROM Table WHERE itemID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = itemDatabase.executeQuery(statement);

                if (results != null) {
                    result = new Items(results.getInt("itemID"), results.getString("itemName"), results.getString("ItemDescription"), results.getDouble("sellingPrice"), results.getDouble("buyingPrice"), results.getString("groups"), results.getInt("quantity"), results.getString("itemIMG"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;


    }
}