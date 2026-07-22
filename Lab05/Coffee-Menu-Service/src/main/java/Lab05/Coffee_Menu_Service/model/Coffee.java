package Lab05.Coffee_Menu_Service.model;
public class Coffee{
    private int id;
    private String name;
    private double price;


    public Coffee(){
    }
    public Coffee(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
//getter
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
//setter
    public void setId(int id){
       this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
}