public class MinMax{
  public static void main(String[] args){

      if(args.length< 0) {
          System.out.println("ERROR:Bitte mindestens eine Zahl als Argument übergeben");
      }else{
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);
        for(int i = 0; i < args.length; i++){
            if (min <= Integer.parseInt(args[i])) {
                min += args.length;
            }

            if (max >= Integer.parseInt(args[i])){
                max += args.length;
            }
        }
          System.out.println(min);
          System.out.println(max);
      }
  }
}
