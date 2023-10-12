/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breads;

public class bread {
    final private Integer breadNumber;
    final private String breadName;
    final private String breadType;
    private Integer breadPrice;
    private Integer breadStock;

    
    public bread(Integer breadNumber, String breadName, String breadType, Integer breadPrice, Integer breadStock){
        this.breadNumber = breadNumber;
        this.breadName = breadName;
        this.breadType = breadType;
        this.breadPrice = breadPrice;
        this.breadStock = breadStock;
    }
    
    public void setPrice(Integer breadPrice) {
        this.breadPrice = breadPrice;
    }
    public void setStock(Integer breadStock) {
        this.breadStock = breadStock;
    }
    public Integer getbreadNumber() {
        return breadNumber;
    }
    public String getbreadName(){
        return breadName;
    }
    public String getType() {
        return breadType;
    }
    public Integer getPrice() {
        return breadPrice;
    }
    public Integer getStock() {
        return breadStock  ;
    }
}


 



