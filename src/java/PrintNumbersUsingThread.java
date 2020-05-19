public class PrintNumbersUsingThread implements Runnable{

  public void run(){
    for(int i=0; i<100; i++){
      system.out.println(i);
    }
  }

public static void main(String[] args){
  Thread t = new Thread(new PrintNumbersUsingThread());
  t.start();
}
}
