package menu;

public class Item {

    private int itemID;
    private String itemTitle;
    private String itemDesc;
    private int itemCost;
    public String itemCategory;

    public Item() {
    }

    public Item(String title, String desc, int cost, String category) {
        this.itemTitle = title;
        this.itemDesc = desc;
        this.itemCost = cost;
        this.itemCategory = category;
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
        return "<b>Категория:<b> " + item.getItemCategory();
    }
//    =====================================================================
//    || Олег, надо написать метод который печатает категорию товара
//    || Как на примере методов выше 
//    =====================================================================
//    public String printItemCategory(Item item) {
//         
//    }

    public String toStringItem(Item item) {
        return printItemTitle(item) + "<br>" + printItemDesc(item) + "<br>" + printItemCost(item) 
                + "<br>" + printItemCategory(item);
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
}