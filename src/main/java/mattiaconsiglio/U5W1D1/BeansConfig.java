package mattiaconsiglio.U5W1D1;

import mattiaconsiglio.U5W1D1.entities.Drink;
import mattiaconsiglio.U5W1D1.entities.Menu;
import mattiaconsiglio.U5W1D1.entities.Pizza;
import mattiaconsiglio.U5W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
    @Bean
    public Topping cheese() {
        return new Topping("cheese", 92, 0.69);
    }

    @Bean
    public Topping ham() {
        return new Topping("ham", 35, 0.99);
    }

    @Bean
    public Topping onion() {
        return new Topping("onion", 22, 0.69);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("pineapple", 24, 0.79);
    }

    @Bean
    public Topping salami() {
        return new Topping("salami", 25, 1.09);
    }

    @Bean
    public List<Topping> getToppings() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(cheese());
        toppings.add(ham());
        toppings.add(onion());
        toppings.add(pineapple());
        toppings.add(salami());

        return toppings;
    }


    @Bean
    public List<Pizza> getPizzas() {
    List<Pizza> pizzas = new ArrayList<>();
    pizzas.add(new Pizza("Margherita", 100, 10.0));
    pizzas.add(new Pizza("Hawaiian Pizza", 150, 15.0));

    return pizzas;
    }


    @Bean
    public List<Drink> getDrinks() {
        List<Drink> drinks = new java.util.ArrayList<>();
        drinks.add(new Drink("CocaCola", 10, 1.0));
        drinks.add(new Drink("Fanta", 10, 1.5));

        return drinks;
    }


    @Bean
    public Menu menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        return new Menu(pizzas, toppings, drinks);
    }
}
