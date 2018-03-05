package items;


public class items {
    String itemName;
    int itemPrice;
    int ItemCount;

    public items(String name, int price, int count){
        this.itemName=name;
        this.itemPrice=price;
        this.ItemCount=count;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
