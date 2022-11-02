package components;

import database.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Utilities {

    //select productname as text, productid as id from products order by text asc
    public static String getSelectBox(String query, String selectedid, String controlname) {
        try {
            PreparedStatement ps = DbConnect.connect().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            String output = "<select id='" + controlname + "' name='" + controlname + "'>\n";
            while (rs.next()) {
                String text = "" + rs.getObject("text");
                String id = "" + rs.getObject("id");

                if (selectedid.equals(id)) {
                    output += "<option selected value='" + id + "'>" + text + "</option>\n";
                } else {
                    output += "<option value='" + id + "'>" + text + "</option>\n";
                }
            }

            output += "</select>\n";
            return output;
        } catch (Exception ex) {
            System.err.println(ex);
            return "";
        }
    }

    public static String getNewReceiptId() {
        try {
            PreparedStatement ps = DbConnect.connect().prepareStatement("select max(reciptno) from purchase");
            ResultSet rs = ps.executeQuery();
            rs.next();
            String s = "" + rs.getObject(1);
            return s;
        } catch (Exception ex) {
            //Some Changes
            System.out.println(ex);
            return "-1";
        }
    }

    public static String getProductsList(String selector, String name) {
        try {
            String output = "<select name='" + name + "'>\n";

            PreparedStatement ps = DbConnect.connect().prepareStatement("select*from products order by productname");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String productid = "" + rs.getObject("productid");
                String productname = "" + rs.getObject("productname");
                if (productid.equals(selector)) {
                    output += "<option selected value='" + productid + "'>" + productname + "</option>\n";
                } else {
                    output += "<option value='" + productid + "'>" + productname + "</option>\n";
                }
            }
            output += "</select>\n";
            return output;
        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }
    }
}
