package Lab05.Coffee_Menu_Service.controller;

import Lab05.Coffee_Menu_Service.model.Coffee;
import Lab05.Coffee_Menu_Service.service.CoffeeService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoffeeController{
    private CoffeeService coffeeservice;
    
     public CoffeeController(CoffeeService coffeeservice){
        this.coffeeservice = coffeeservice;
        
    }
    @GetMapping("/coffees")
    public ResponseEntity<List<Coffee>> getAllCoffees(){
        if(coffeeservice == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(coffeeservice.getCoffees());
    }

    @GetMapping("/coffees/{id}")
    public ResponseEntity<Coffee> getCoffeeById(@PathVariable int id){
        Coffee foundCoffee = coffeeservice.getCoffeeById(id);
        if(foundCoffee == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(foundCoffee);
    }
    
    @PostMapping("/coffees")
    public ResponseEntity<Coffee> addCoffee(@RequestBody Coffee coffee) {
        Coffee newCoffee = coffeeservice.postCoffee(coffee);
        return ResponseEntity.status(201).body(newCoffee);
    }

    @PutMapping("/coffees/{id}")
    public ResponseEntity<Coffee> putCoffee(@PathVariable int id, @RequestBody Coffee updateData){
        Coffee result = coffeeservice.updateCoffee(id,updateData);
        if(result == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }
    
    @DeleteMapping("/coffees/{id}")
    public ResponseEntity<Void> DeleteCoffee(@PathVariable int id){
        Boolean result = coffeeservice.removeCoffee(id);
        if(result == false){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
