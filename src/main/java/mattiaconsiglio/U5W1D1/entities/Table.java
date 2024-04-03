package mattiaconsiglio.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@Component
public class Table {
    private int tableNumber;
    private TableStatus tableStatus;
    private int maxSeats;
}
