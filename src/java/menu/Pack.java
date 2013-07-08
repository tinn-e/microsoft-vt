package menu;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private static int summ;
    public static ArrayList<Item> ListPack = new ArrayList<Item>();

    public static void AddToListPack(String itemTitle, String itemDesc, int itemCost) {
        Item item = new Item(itemTitle, itemDesc, itemCost);
        ListPack.add(item);
    }

    public ArrayList getListPack() {
        return ListPack;
    }

    public void setListPack(ArrayList<Item> listPack) {
        ListPack = listPack;
    }

    public static void ClearPack(List<Item> ListPack) {
        ListPack.clear();
        summ = 0;
    }

    public void DeleteItemFromPack(Item item) {
        ListPack.remove(item);
        summ = summ - item.getItemCost();
    }

    public static int SummPack(List<Item> ListPack) {
        for (menu.Item i : ListPack) {
            summ += i.getItemCost();
        }
        return summ;
    }
}