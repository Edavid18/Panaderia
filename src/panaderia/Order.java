/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panaderia;

import java.util.ArrayList;

/**
 *
 * @author eliasvidal
 */
public class Order {
    
    public static Order Controller = new Order();
    
    private boolean plasticBag;
    
    private Client client = new Client();
    private ArrayList<Soda> Sodas = new ArrayList();
    private ArrayList<Bread> Breads = new ArrayList();
    private ArrayList<Dessert> Desserts = new ArrayList();
    
    public void client(String name, int id, String type){
        client.setName(name);
        client.setId(id);
        client.setType(type);
    }
    
    public Client getClient(){
        return client;
    }
    
    public void addSoda(String size, int amount){
        Soda obj = new Soda();
        obj.setSize(size);
        obj.setAmount(amount);
        
        Sodas.add(obj);
    }
    
    public void addBread(int type, int amount){
        Bread obj = new Bread();
        obj.setType(type);
        obj.setAmount(amount);
        
        Breads.add(obj);
    }
    
    public void addDessert(String flavor, int amount){
        Dessert obj = new Dessert();
        obj.setFlavor(flavor);
        obj.setAmount(amount);
        
        Desserts.add(obj);
    }
    
    public Soda getSoda(int pos){
        return Sodas.get(pos);
    }
    
    public Bread getBread(int pos){
        return Breads.get(pos);
    }
    
    public Dessert getDessert(int pos){
        return Desserts.get(pos);
    }
    
    public int sodaSize(){
        return Sodas.size();
    }
    
    public int breadSize(){
        return Breads.size();
    }
    
    public int dessertSize(){
        return Desserts.size();
    }
    
    public double SubTotal(){
        double subTotal = 0;
        
        for (int i = 0; i < Sodas.size(); i++) {
            subTotal = subTotal + Sodas.get(i).CalcPrice();
        }
        
        for (int i = 0; i < Breads.size(); i++) {
            subTotal = subTotal + Breads.get(i).CalcPrice();
        }
        
        for (int i = 0; i < Desserts.size(); i++) {
            subTotal = subTotal + Desserts.get(i).CalcPrice();
        }
        
        return subTotal;
    }
    
    public double Iva(){
        double iva = 0;
        
        for (int i = 0; i < Sodas.size(); i++) {
            iva = iva + Sodas.get(i).Iva();
        }
        
        for (int i = 0; i < Breads.size(); i++) {
            iva = iva + Breads.get(i).Iva();
        }
        
        for (int i = 0; i < Desserts.size(); i++) {
            iva = iva + Desserts.get(i).Iva();
        }
        
        return iva;
    }
    
    public double calculateDiscountOnClient(){
        switch (client.getType()){
            case "A":
                return SubTotal() * 0.1;
            
            case "B":
                return SubTotal() * 0.07;
                
            case "C":
                return SubTotal() * 0.04;
                
            default:
                return 0;
        }
    }
    
    public double Total(){
        if (plasticBag) {
            return SubTotal() + Iva() + 400 - calculateDiscountOnClient();
        }else{
            return SubTotal() + Iva() - calculateDiscountOnClient(); 
        }
    }

    public boolean isPlasticBag() {
        return plasticBag;
    }

    public void setPlasticBag(boolean plasticBag) {
        this.plasticBag = plasticBag;
    }
    
    
    
}
