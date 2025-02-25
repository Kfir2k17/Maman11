    /*
     * MaxLine.java
     * The program is taking three cordinates, finding the largest distance between to points, and printing the value of the cordinates.
    */
    import java.util.Scanner;
    public class MaxLine
    {
         public static void main (String [] args)
         {
             Scanner scan = new Scanner (System.in);
             System.out.println("Enter first point coordinates:");
             int x1 = scan.nextInt();
             int y1 = scan.nextInt();
             System.out.println ("Enter second point coordinates:");
             int x2 = scan.nextInt();
             int y2 = scan.nextInt();
             System.out.println ("Enter third point coordinates:");
             int x3 = scan.nextInt();
             int y3 = scan.nextInt();
             
             double l1 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
             double l2 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
             double l3 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
             // This section is finding the length of each line
             
             int max_x1 = x1;
             int max_y1 = y1;
             int max_x2 = x2;
             int max_y2 = y2;
             
             if (l2 > l1 && l2 > l3){
                max_x2 = x3;
                max_y2 = y3;
             }
             
             else if (l3 > l2 && l3 > l1){
                max_x1 = x2;
                max_y1 = y2;
                max_x2 = x3;
                max_y2 = y3;
             }
             // This section is setting the cordinates of the max line.
             
             System.out.println ("Max line created by the following points:" + "(" + max_x1 + "," + max_y1 + "), "  + "(" + max_x2 + "," + max_y2 + ").");
         } // end of method main
    } //end of class MaxLine