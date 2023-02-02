import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Plate {
  private int food;

  @Override
  public String toString() {
    return "Plate{" +
      "food=" + food +
      '}';
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
