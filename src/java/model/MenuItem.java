package model;

/**
 *
 * @author benja_000
 */
public class MenuItem {

    private int menuId;
    private String menuItem;
    private double itemPrice;
    private int category;
    private String menuValue;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getMenuValue() {
        return menuValue;
    }

    public void setMenuValue(String menuValue) {
        this.menuValue = menuValue;
    }

    @Override
    public String toString() {
        return "menuId=" + menuId + ", menuItem=" + menuItem + ", itemPrice=" + itemPrice + ", category=" + category + ", menuValue=" + menuValue;
    }
}
