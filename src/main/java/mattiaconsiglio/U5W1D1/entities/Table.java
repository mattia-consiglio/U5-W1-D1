package mattiaconsiglio.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Table {
    private int tableNumber;
    private TableStatus tableStatus;
    private int maxSeats;
}
