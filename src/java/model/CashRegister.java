/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author benja_000
 */
public class CashRegister {

    private double bill = 0;
    private double salesTax = .056;
    private double totalBill = 0;
    private String[] item;
    private String foodName;
    private String foodPrice;
    private String order = "";
    private static final String SPLIT = "/";
    private static final String SPACE = " ";
    private static final String BREAK = "<br />";

    public String getBillForCustomer(String[] orders) {
        for (String order : orders) {
            item = order.split(SPLIT);
            foodName = item[0];
            foodPrice = item[1];
        }
        bill = bill + Double.valueOf(foodPrice);
        order = order + foodName + SPACE + Double.parseDouble(foodPrice) + BREAK;
        order += "Bill: " + bill + BREAK
                + "Sales Tax: " + salesTax + BREAK
                + "Grand Total: " + totalBill;
        return order;
    }

    public double getSalesTax(double bill, double salesTax) {
        totalBill = bill * salesTax;
        return totalBill;
    }
}
