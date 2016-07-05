import javax.swing.JOptionPane;

public class SieveOfEratosthenes{
   public void runEratosthenesSieve(int upperBound) {
      int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
      boolean[] isComposite = new boolean[upperBound + 1];
      for (int m = 2; m <= upperBoundSquareRoot; m++) {
         if (!isComposite[m]) {
            System.out.print(m + " ");
            for (int k = m * m; k <= upperBound; k += m)
               isComposite[k] = true;
         }
      }
      for (int m = upperBoundSquareRoot; m <= upperBound; m++)
         if (!isComposite[m])
            System.out.print(m + " ");
   }
   public static void main(String[] args)
   {SieveOfEratosthenes s = new SieveOfEratosthenes();
      int st = new Integer(JOptionPane.showInputDialog("Shkruaj nr te plote pozitiv")).intValue();
   
      s.runEratosthenesSieve(st);}
                  
                  
}