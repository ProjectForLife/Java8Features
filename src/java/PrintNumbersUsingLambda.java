public class PrintNumbersUsingLambda{
  public static void main(String[] args){
    Thread t = new Thread(() -> {
      for(int i=0; i< 100; i++){
        System.out.println(i);
      }
    });
  }
}
