/*
  Isaac de Castro Amorim
  14/05/2025
  Atividade 004
*/
public class BasicOperations {
  public static Integer basicMath(String op, int v1, int v2) {
    switch (op) {
      case "+":
        return v1 + v2;
      case "-":
        return v1 - v2;
      case "*":
        return v1 * v2;
      case "/":
        if (v2 == 0) {
          throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return v1 / v2;
      default:
        throw new IllegalArgumentException("Operador inválido. Use +, -, * ou /.");
    }
  }

  public static void main(String[] args) {
    System.out.println(basicMath("+", 4, 7)); 
    System.out.println(basicMath("-", 15, 18)); 
    System.out.println(basicMath("*", 5, 5)); 
    System.out.println(basicMath("/", 49, 7)); 
  }
}
