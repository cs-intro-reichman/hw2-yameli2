public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" +time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" +time.charAt(3) + time.charAt(4));
        int totalMinutes = (hours*60)+minutes+minutesToAdd;
        int totalHours = totalMinutes/60;
        hours = totalHours%24;
        minutes = totalMinutes-(totalHours*60);
        if(hours<10)
        {
            if (minutes<10) {
                System.out.println("0"+hours+":0"+minutes);                
            }
            else
            System.out.println("0"+hours+":"+minutes);
        }
        else
        {
            if (minutes<10) {
                System.out.println(hours+":0"+minutes);                
            }
            else
            System.out.println(hours+":"+minutes);
        }  
    }
}