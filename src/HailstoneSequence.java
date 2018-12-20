import acm.program.ConsoleProgram;

public class HailstoneSequence extends ConsoleProgram {

    public void run() {
        String hailstone = readLine("Please enter a number : ");
        int hailstoneNumber = Integer.parseInt(hailstone);

        while(hailstoneNumber != 1){
            if(hailstoneNumber % 2 == 0){
                println(hailstoneNumber + " is even, so I take half : " + hailstoneNumber/2);
                hailstoneNumber /= 2;
            } else {
                println(hailstoneNumber + " is odd, so I make 3n+1 : " + (3*hailstoneNumber + 1));
                hailstoneNumber = 3*hailstoneNumber + 1;
            }
        }
        println("HailstoneNumber is now " + hailstoneNumber + "!");

    }

}