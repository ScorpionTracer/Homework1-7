import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Plate {

  private int food;

  public void info() {
    System.out.println("plate:" + food);
  }

  public void decreaseFood (int appetite) {
    if (this.food - appetite < 0) {
      throw new IllegalArgumentException("Недостаточно еды в миске");
    } else {
      this.food -= appetite;
    }
  }
  public void addFood(int addFood){
    this.food+=addFood;
  }
}
