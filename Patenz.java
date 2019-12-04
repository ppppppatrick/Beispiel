public class Patenz {

  private static int potenzRecursive(int x, int y){
    return (Math.pow(x, y));


  }

  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
      System.out.println(Math.pow(x, y));

  }
}
