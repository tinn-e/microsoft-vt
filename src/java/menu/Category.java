package menu;

public class Category {
    private Integer categoryID;
    private String categoryName;
    
    public Category() {}
    public Category(Integer catID, String catName) {
        this.categoryID = catID;
        this.categoryName = catName;
    }
        
    public void setID (Integer ID){
        this.categoryID = ID;
    }
    
    public Integer getID (){
        return categoryID;
    }
    
    public void setCategoryName (String categoryName){
        this.categoryName = categoryName;
    }
    
    public String getCategoryName(){
        return categoryName;
    }
}
