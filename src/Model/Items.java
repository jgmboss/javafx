package Model;

public class Items {
    private int itemID;
    private String itemName;
    private String ItemDescription;
    private Double sellingPrice;
    private Double buyingPrice;
    private String group;
    private int quantity;

    public Items(int itemID, String itemName, String itemDescription, Double sellingPrice, Double buyingPrice, String group, int quantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        ItemDescription = itemDescription;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.quantity = quantity;
        this.group = group;
    }

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
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return itemName + ItemDescription + group;
    }
}
