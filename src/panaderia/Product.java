/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panaderia;

/**
 *
 * @author camilo
 */
public abstract class Product {
    protected int idproduct;
    protected int bacth;
    protected String expDate;

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public int getBacth() {
        return bacth;
    }

    public void setBacth(int bacth) {
        this.bacth = bacth;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
}
