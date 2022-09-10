//DNA Sequencing
public class DNA {
 
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 =  "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna1;
    //System.out.println(dna1.length());
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
    //System.out.println("Start:" + start);
   if(start != -1 && stop != -1 && (start - stop) % 3 == 0){
     System.out.println("3 conditions are met! This is a valid protein");
   }
   else{
     System.out.println("This is no valid protein");
   }
  }
 
}
