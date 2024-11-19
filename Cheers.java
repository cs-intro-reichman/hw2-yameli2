// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheerWord = args[0];
                int numOfCheer = Integer.parseInt(args[1]);
                String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String capitalCheerWord ="";
                for(int j=0;j<cheerWord.length();j++)
                {
                 char letter = cheerWord.charAt(j);
                 if(ABC.indexOf(letter) == -1)
                 {
                switch (letter) {
                    case 'a':  capitalCheerWord += "A";
                             break;
                    case 'b':  capitalCheerWord += "B";
                             break;
                    case 'c':  capitalCheerWord += "C";
                             break;
                    case 'd':  capitalCheerWord += "D";
                             break;
                    case 'e':  capitalCheerWord += "E";
                             break;
                    case 'f':  capitalCheerWord += "F";
                             break;
                    case 'g':  capitalCheerWord += "G";
                             break;
                    case 'h':  capitalCheerWord += "H";
                             break;
                    case 'i':  capitalCheerWord += "I";;
                             break;
                    case 'j':  capitalCheerWord += "J";
                             break;
                    case 'k':  capitalCheerWord += "K";
                             break;
                    case 'l':  capitalCheerWord += "L";
                             break;
                    case 'm':  capitalCheerWord += "M";
                             break;
                    case 'n':  capitalCheerWord += "N";
                             break;
                    case 'o':  capitalCheerWord += "O";
                             break;
                    case 'p':  capitalCheerWord += "P";
                             break;
                    case 'q':  capitalCheerWord += "Q";
                             break;
                    case 'r':  capitalCheerWord += "R";
                             break;
                    case 's':  capitalCheerWord += "S";
                             break;
                    case 't':  capitalCheerWord += "T";
                             break;
                    case 'u':  capitalCheerWord += "U";
                             break;
                    case 'v':  capitalCheerWord += "V";
                             break;
                    case 'w':  capitalCheerWord += "W";
                             break;
                    case 'x':  capitalCheerWord += "X";
                             break;
                    case 'y':  capitalCheerWord += "Y";
                             break;
                    case 'z':  capitalCheerWord += "Z";
                             break;
                 }
                }
                else{
                        capitalCheerWord += letter;
                } 
                }
                String addAnLetters = "AEFHILMNORSX";
                for(int i =0; i<capitalCheerWord.length(); i++)
                {
                        if (addAnLetters.indexOf(capitalCheerWord.charAt(i)) == -1)
                        {
                                System.out.println("AGive me a  "+capitalCheerWord.charAt(i)+": "+capitalCheerWord.charAt(i)+"!");      
                        }
                        else
                        {
                                System.out.println("AGive me an "+capitalCheerWord.charAt(i)+": "+capitalCheerWord.charAt(i)+"!");
                        }
                }
                System.out.println("AWhat does it spell?");
                for(int b=0;b<numOfCheer;b++)
                        System.out.println("A"+capitalCheerWord+"!!!");   
        }
}
