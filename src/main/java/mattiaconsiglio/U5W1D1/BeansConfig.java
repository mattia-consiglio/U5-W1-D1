package mattiaconsiglio.U5W1D1;

import mattiaconsiglio.U5W1D1.entities.Drink;
import mattiaconsiglio.U5W1D1.entities.Menu;
import mattiaconsiglio.U5W1D1.entities.Pizza;
import mattiaconsiglio.U5W1D1.entities.Topping;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping onion() {
        return new Topping("Onion", 22, 0.69);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 25, 1.09);
    }


    @Bean
    @Primary
    public List<Topping> getToppings() {
        return new ArrayList<>(List.of(cheese(), ham(), onion(), pineapple(), salami()));
    }

    @Bean
    public List<Pizza> getPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Margherita", 1104, 10.0));
        pizzas.add(new Pizza("Hawaiian Pizza", 1024, 15.0, List.of(cheese(), ham(), pineapple())));
        pizzas.add(new Pizza("Salami Pizza", 1160, 12.0, List.of(cheese(), onion(), salami())));

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
    public Menu menu(List<Pizza> pizzas, @Qualifier("getToppings") List<Topping> toppings, List<Drink> drinks) {
        return new Menu(pizzas, toppings, drinks);
    }
}
