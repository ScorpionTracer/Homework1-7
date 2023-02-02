import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class Cat {
  private final String name;
  private final int appetite;
  private boolean fullAppetite;

  public int getAppetite() {
    return appetite;
  }

  public void eat(@NotNull Plate plate) {
    plate.decreaseFood(appetite);
  }

  public boolean checkPlate (int appetite, int food){
    return food>=appetite;
  }
}
