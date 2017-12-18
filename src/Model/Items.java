package Model;

/*import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
*/

public class Items {
    /*private final SimpleIntegerProperty itemID;
    private final SimpleStringProperty itemName;
    private final SimpleStringProperty itemDescription;
    private final SimpleDoubleProperty sellingPrice;
    private final SimpleDoubleProperty buyingPrice;
    private final SimpleStringProperty groups;
    private final SimpleIntegerProperty quantity;
    private final SimpleStringProperty itemIMG;
    */
    private int itemID;
    private String itemName;
    private String itemDescription;
    private double sellingPrice;
    private double buyingPrice;
    private String groups;
    private int quantity;
    private String itemIMG;

    public Items(int itemID, String itemName, String itemDescription, Double sellingPrice, Double buyingPrice, String groups, int quantity, String itemIMG) {
        this.itemID = itemID;//new SimpleIntegerProperty(itemID);
        this.itemName  = itemName;//new SimpleStringProperty( itemName);
        this.itemDescription  = itemDescription;//new SimpleStringProperty( itemDescription);
        this.sellingPrice  = sellingPrice;//new SimpleDoubleProperty(sellingPrice);
        this.buyingPrice  = buyingPrice;//new SimpleDoubleProperty(buyingPrice);
        this.groups  = groups;//new SimpleStringProperty(groups);
        this.quantity  = quantity;//new SimpleIntegerProperty(quantity);
        this.itemIMG  = itemIMG;//new SimpleStringProperty(itemIMG);
    }

   /* public int getItemID() {
        return itemID.get();
    }

    public SimpleIntegerProperty itemIDProperty() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID.set(itemID);
    }

    public String getItemName() {
        return itemName.get();
    }

    public SimpleStringProperty itemNameProperty() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName.set(itemName);
    }

    public String getItemDescription() {
        return itemDescription.get();
    }

    public SimpleStringProperty itemDescriptionProperty() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription.set(itemDescription);
    }

    public double getSellingPrice() {
        return sellingPrice.get();
    }

    public SimpleDoubleProperty sellingPriceProperty() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice.set(sellingPrice);
    }

    public double getBuyingPrice() {
        return buyingPrice.get();
    }

    public SimpleDoubleProperty buyingPriceProperty() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice.set(buyingPrice);
    }

    public String getGroups() {
        return groups.get();
    }

    public SimpleStringProperty groupsProperty() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups.set(groups);
    }

    public int getQuantity() {
        return quantity.get();
    }

    public SimpleIntegerProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }

    public String getItemIMG() {
        return itemIMG.get();
    }

    public SimpleStringProperty itemIMGProperty() {
        return itemIMG;
    }

    public void setItemIMG(String itemIMG) {
        this.itemIMG.set(itemIMG);
    }*/

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemIMG() {
        return itemIMG;
    }

    public void setItemIMG(String itemIMG) {
        this.itemIMG = itemIMG;
    }

    @Override
    public String toString() {
        return  itemName +" " + itemDescription +" " + groups +" " + itemIMG;
    }
}
