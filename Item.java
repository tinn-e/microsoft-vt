package tinne;
import java.util.*;

public class Item {
   private int ID;
   private String Title; 
   private String Description;   
   private float Cost;
   private Set MenuContainer;
   
   public Item() {}
   public Item(String title, String desc, float cost) {
      this.Title = title;
      this.Description = desc;
      this.Cost = cost;
   }
   public int getID() {
      return ID;
   }
   public void setID(int id) {
      this.ID = id;
   }
   public String getTitle() {
      return Title;
   }
   public void setTitle(String title) {
      this.Title = title;
   }
   public String getDescription() {
      return Description;
   }
   public void setDescription(String desc) {
      this.Description = desc;
   }
   public float getCost() {
      return Cost;
   }
   public void setCost(float cost) {
      this.Cost = cost;
   }

   public Set getMenuContainer() {
      return MenuContainer;
   }
   public void setMenuContainer( Set MenuContainer ) {
      this.MenuContainer = MenuContainer;
   }
}
