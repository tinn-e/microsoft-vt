package qq;

public class Item {
   private int id;
   private String prodTitle; 
   private String prodDesc;   
   private int prodCost;  

   public Item() {}
   public Item(String fname, String lname, int salary) {
      this.prodTitle = fname;
      this.prodDesc = lname;
      this.prodCost = salary;
   }
   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
   public String getProdTitle() {
      return prodTitle;
   }
   public void setProdTitle( String first_name ) {
      this.prodTitle = first_name;
   }
   public String getProdDesc() {
      return prodDesc;
   }
   public void setProdDesc( String last_name ) {
      this.prodDesc = last_name;
   }
   public int getProdCost() {
      return prodCost;
   }
   public void setProdCost( int salary ) {
      this.prodCost = salary;
   }
}