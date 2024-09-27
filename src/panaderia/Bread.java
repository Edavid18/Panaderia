/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panaderia;

import javax.swing.JOptionPane;

/**
 *
 * @author camilo
 */
public class Bread extends Product implements CalculatePrice{

    private int type;
    private double price;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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

    

    @Override
    public double CalcPrice() {
         switch (getType()) {
            case 1:
                return 1200;

            case 2:
                return 4500;

            case 3:
                return 8900;

            default:
                JOptionPane.showInputDialog(null, "Error");
                return 0;
        }
    }
   @Override
    public double Iva() {
        double getIva = CalcPrice()*0.9;
        
        return getIva;
    }

    

}
