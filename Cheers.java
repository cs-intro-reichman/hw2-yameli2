// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheerWord = args[0];
                int numOfCheer = Integer.parseInt(args[1]);
                cheerWord = cheerWord.toUpperCase();
                String letters = "AEFHILMNORSX";
                for(int i =0; i<cheerWord.length(); i++)
                {
                        if (letters.indexOf(cheerWord) == -1){
                                System.out.println("GIVE ME a "+cheerWord.charAt(i)+": "+cheerWord.charAt(i)+"!");      
                        }
                        else
                        {
                                System.out.println("GIVE ME an "+cheerWord.charAt(i)+": "+cheerWord.charAt(i)+"!");
                        }
                }
                System.out.println("What does it spell?");
                for(int b=0;b<cheerWord.length();b++)
                        System.out.println(cheerWord+"!!!");   
        }
}
