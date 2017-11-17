package Model;
public class Items {
    private int itemID;
    private String itemName;
    private String ItemDescription;
    private Double sellingPrice;
    private Double buyingPrice;
    private String groups;
    private int quantity;
    private String itemIMG;

    public Items(int itemID, String itemName, String itemDescription, Double sellingPrice, Double buyingPrice, String groups, int quantity, String itemIMG) {
        this.itemID = itemID;
        this.itemName = itemName;
        ItemDescription = itemDescription;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.groups = groups;
        this.quantity = quantity;
        this.itemIMG = itemIMG;
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
        itemIMG = itemIMG;
    }

    @Override
    public String toString() {
        return itemID + ' ' + itemName + ' ' + ItemDescription +' '+'£'+  sellingPrice +' '+'£'+  buyingPrice +' '+ groups+ ' '+ quantity;
    }


}
