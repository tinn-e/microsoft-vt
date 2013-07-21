package menu;

public class Item {

    private int itemID;
    private String itemTitle;
    private String itemDesc;
    private int itemCost;
    public String itemCategory;
    public String itemImage;
    private int markOfUser = 0;
    private int valueOfMarks = 0;
    private double ratingOfItem = 0.0;

    public void setMarkOfUser(int markOfUser) {
        this.markOfUser = markOfUser;
    }

    public void setValueOfMarks(int valueOfMarks) {
        this.valueOfMarks = valueOfMarks;
    }

    public void setRatingOfItem(double rating) {
        this.ratingOfItem = rating;
    }

    public int getMarkOfUser() {
        return markOfUser;
    }

    public int getValueOfMarks() {
        return valueOfMarks;
    }

    public double getRatingOfItem() {
        return ratingOfItem;
    }


    public Item() {
    }

    public Item(String title, String desc, int cost, String category, String image) {
        this.itemTitle = title;
        this.itemDesc = desc;
        this.itemCost = cost;
        this.itemCategory = category;
        this.itemImage = image;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int id) {
        this.itemID = id;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String title) {
        this.itemTitle = title;
    }
    public String getItemImage() {
        return itemTitle;
    }

    public void setItemImage(String image) {
        this.itemTitle = image;
    }
    
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String desc) {
        this.itemDesc = desc;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int cost) {
        this.itemCost = cost;
    }
    
    public void setItemCategory(String category) {
        this.itemCategory = category;
    }
    
    public String getItemCategory() {
        return itemCategory;
    }

    public String printItemTitle(Item item) {
        return "<b>Название:</b> " + item.getItemTitle();
    }

    public String printItemDesc(Item item) {
        return "<b>Описание:</b> " + item.getItemDesc();
    }

    public String printItemCost(Item item) {
        return ("<b>Цена:</b> " + item.getItemCost() + " руб").toString();
    }
    
    public String printItemCategory(Item item){
        return "<b>Категория:</b> " + item.getItemCategory();
    }
    
    public String printItemImage(Item item){
        return "<b>Фото:</b> " + item.getItemImage();
    }

    public String toStringItem(Item item) {
        return printItemTitle(item) + "<br>" + printItemDesc(item) + "<br>" + printItemCost(item) 
                + "<br>" + printItemCategory(item);
    }
    
    public String toUrlforCart(Item item) {
        return "itemTitle=" + item.getItemDesc() + "&itemDesc=" + item.getItemDesc() + "&itemCost=" + item.getItemCost() 
                + "&itemCategory=" + item.getItemCategory();
    }

    public boolean equals(Item obj) {
        if (obj == null)
            return false;
        // проверка на случай, если сравнение с самим собой
        if (obj == this)
            return true;
        if (obj.getClass() == this.getClass()) {
            Item item = (Item) obj;
            if (item.itemID == this.itemID            && 
                item.itemTitle.equals(this.itemTitle) &&
                item.itemDesc.equals(this.itemDesc)   &&
                item.itemCost == this.itemCost)
                return true;
        }
        return false;
    }
    
    public void setMark(int mark){
        this.setMarkOfUser(this.markOfUser+=mark); 
        this.setValueOfMarks(this.getValueOfMarks()+1);
        this.setRatingOfItem((double)this.getMarkOfUser()/(double)this.getValueOfMarks());
    }
    public String toString() {
        return itemTitle + itemDesc + itemCost;
    }
}