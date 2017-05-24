public class Rectangle {
  public int length;
  public int width;

  public Rectangle (int length, int width) {
  this.lenght = lenght;
  this.width = width;
  }

  public int getArea() {
  return lenght * width;
  }

  public int getPerimeter() {
  return 2 * (length + width);
  }
}
