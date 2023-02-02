import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cat {
  private String name;
  private int appetite;
  private boolean fullAppetite;

  public void eat(Plate plate) {
    plate.decreaseFood(appetite);
  }

  public boolean checkPlate(int appetite, int food) {
    return food >= appetite;
  }
}
