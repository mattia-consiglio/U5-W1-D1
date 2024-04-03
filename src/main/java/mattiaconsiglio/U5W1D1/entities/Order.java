package mattiaconsiglio.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Component
public class Order {
    private int orderNumber;
    private OrderStatus status;
    private List<Food> foods;
    private int seatsNumber;
    private LocalTime time;
    private List<Table> tables;
    private int totalPrice;

}
