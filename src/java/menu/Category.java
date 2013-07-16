package menu;

public class Category {

    private int categoryID;
    private String categoryName;

    public Category() {
    }

    public Category(String catName) {
        this.categoryName = catName;
    }

    public Category(int ID, String catName) {
        this.categoryID = ID;
        this.categoryName = catName;
    }

    public void setCategoryID(int ID) {
        this.categoryID = ID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public boolean equals(Category obj) {
        if (obj == null) {
            return false;
        }
        // проверка на случай, если сравнение с самим собой
        if (obj == this) {
            return true;
        }
        if (obj.getClass() == this.getClass()) {
            Category cat = (Category) obj;
            if (cat.categoryID == this.categoryID
                    && cat.categoryName.equals(this.categoryName)) {
                return true;
            }
        }
        return false;
    }
}
