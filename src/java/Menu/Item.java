/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Menu;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Item {

    private String Name;
    private String Consistance;
    private Double Cost;
    
    public Item(String NameD, String ConsistanceD, Double CostD) {
        this.Name = NameD;
        this.Consistance = ConsistanceD;
        this.Cost = CostD;

    }
    public Item(){
    }
    
       public String getName() {
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }

    public String getConsistance() {
        return Consistance;
    }
    public void setConsistance(String a){
        this.Consistance = a;
    }

    public Double getCost() {
        return Cost;
    }
    public void setCost(Double b){
        this.Cost = b;
    }
}