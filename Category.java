package tinne;

public class Category {
   private int ID;
   private String CategoryName; 

   public Category () {}
   public Category (String name) {
      this.CategoryName = name;
   }
   public int getId() {
      return ID;
   }
   public void setId(int id) {
      this.ID = id;
   }
   public String getCategoryName() {
      return CategoryName;
   }
   public void setCategoryName(String CategoryName) {
      this.CategoryName = CategoryName;
   }
   public boolean equals(Object obj) {
      if (obj == null) return false;
      if (!this.getClass().equals(obj.getClass())) return false;

      Category obj2 = (Category)obj;
      if((this.ID == obj2.getId()) && (this.CategoryName.equals(obj2.getCategoryName())))
      {
         return true;
      }
      return false;
   }
   public int hashCode() {
      int tmp = 0;
      tmp = (ID + CategoryName).hashCode();
      return tmp;
   }
}
