package pages.basket;

import org.openqa.selenium.By;

public class BasketPage {
    public static String EMPTY_BASKET_INFO_MESSAGE = "Your Cart is empty !";

    public static By REMOVE_BUTTON = By.id("text_action1");
    public static By TOTAL_PRICE_TEXTBOX = By.id("text_action_bottom1");
    public static By EMPTY_BASKET_INFO_TEXT = By.id("tvInfo");
    public static By SHOP_NOW_BUTTON = By.id("bAddNew");
}
