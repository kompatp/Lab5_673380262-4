package Lab05.Coffee_Menu_Service.service;

import Lab05.Coffee_Menu_Service.model.Coffee;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


@Service
public class CoffeeService{
    private List<Coffee>  coffees;
    public CoffeeService(){
        this.coffees = new ArrayList<>();
        coffees.add(new Coffee(1,"latte",5.56));
        coffees.add(new Coffee(2,"matcha",8.86));
    }

   public List<Coffee> getCoffees(){
    return coffees;
   }
   public Coffee getCoffeeById(int id){
    for(int i = 0; i<coffees.size();i++){
        if(coffees.get(i).getId() == id){
            return coffees.get(i);
        }
    }
    return null;
   }
   public Coffee postCoffee(Coffee newCoffee){
        int newId;
        if (coffees.isEmpty()) {
        newId = 1;
    } else {
        newId = coffees.get(coffees.size() - 1).getId() + 1;
    }
        newCoffee.setId(newId);
        coffees.add(newCoffee);
        return newCoffee;
   }

    public Coffee updateCoffee(int id, Coffee updatedData) {  
        for (int i = 0; i < coffees.size(); i++) {
            if (coffees.get(i).getId() == id) { 
                if(updatedData.getName() != null){
                    coffees.get(i).setName(updatedData.getName());
                }
                if(updatedData.getPrice() != 0){
                    coffees.get(i).setPrice(updatedData.getPrice());
                }
                return coffees.get(i);
            }
        }
        return null;
    }
    public Boolean removeCoffee(int id) {  
        for (int i = 0; i < coffees.size(); i++) {
            if (coffees.get(i).getId() == id) { 
                coffees.remove(i);
                return true;
            }
        }
        return false;
    }

}