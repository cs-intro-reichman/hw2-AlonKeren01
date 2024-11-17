public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int TotalMinutes = (hours * 60) + minutes + minutesToAdd;
        int TotalHours = TotalMinutes / 60;
        int NewHours = TotalHours % 24; 
        int NewMinutes = TotalMinutes - (TotalHours * 60); 

        String sNewHours = Integer.toString(NewHours); //print this as the new hour
        String sNewMinutes = Integer.toString(NewMinutes); //print this as the new minutes

        if (NewHours < 10) sNewHours = "0" + sNewHours; 
        if (NewMinutes < 10) sNewMinutes = "0" + sNewMinutes;

        System.out.println(sNewHours + ":" + sNewMinutes);
        
    }
}
