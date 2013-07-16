package menu;
import java.util.ArrayList;
import java.util.List;
import menu.Item;

public class Pack {
    private int summ;
    public ArrayList<Item> ListPack = new ArrayList<Item>();
    public Pack(){}

    public void AddToListPack(String itemTitle, String itemDesc, int itemCost, String itemCategory) {
        Item item = new Item(itemTitle, itemDesc, itemCost, itemCategory);
        this.ListPack.add(item);
    }

    public ArrayList getListPack() {
        return ListPack;
    }

    public void setListPack(ArrayList<Item> listPack) {
        this.ListPack = listPack;
    }

    public void ClearPack(List<Item> ListPack) {
        ListPack.clear();
        this.summ = 0;
    }

    public void DeleteItemFromPack(Item item) {
        this.ListPack.remove(item);
        this.summ = summ - item.getItemCost();
    }

    public  int SummPack(List<Item> ListPack) {
        for (menu.Item i : ListPack) {
            this.summ += i.getItemCost();
        }
        return summ;
    }
}