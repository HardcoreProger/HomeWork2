import java.util.Scanner;

public class Exercise1 {//alt + 1 to directory
    public static void main (String [] args) {
        //dialogue 20 quests

        System.out.println("\nHi, im just a test for for novice java programmer");
        Scanner in = new Scanner(System.in);
        System.out.print("press any key to start testing");
        in.nextLine();

        byte count = 0; //inc = count;//count true answers & var for add points

        //1
        System.out.println("\n question 1/20");
        System.out.println("how many bytes does the \"byte\" variable take up?");
        byte answ1 = in.nextByte(), fq = 1;
        if(answ1 == fq){
            ++count;
        }
        //2
        System.out.println("question 2/20");
        System.out.println("how many bytes does the \"short\" variable take up?");
        short answ2 = in.nextShort(),sq = 2;
        if(answ2 == sq){
            ++count;
        }
        //3
        System.out.println("question 3/20");
        System.out.println("how many bytes does the \"int\" variable take up?");
        int answ3 = in.nextInt(),thq = 4;
        if(answ3 == thq){
            ++count;
        }
        //4
        System.out.println("question 4/20");
        System.out.println("how many bytes does the \"long\" variable take up?");
        long answ4 = in.nextLong(), fthq = 8;
        if(answ4 == fthq){
            ++count;
        }
        //5
        System.out.println("question 5/20");
        System.out.println("how many bytes does the \"float\" variable take up?");
        float answ5 = in.nextFloat(), fivq = 4;
        if(answ5 == fivq){
            ++count;
        }
        //6
        System.out.println("question 6/20");
        System.out.println("in what year did the java programming language appear?");
        short answ6 = in.nextShort(), sixq = 1996;
        if(answ6 == sixq){
            ++count;
        }
        //7
        System.out.println("question 7/20");
        System.out.println("how many letters are in the word java?");
        byte answ7 = in.nextByte(), sevq = 4;
        if(answ7 == sevq){
            ++count;
        }
        //8
        System.out.println("question 8/20");
        System.out.println("maximum string length in java");
        int answ8 = in.nextInt(), eihgtq = 2147483647;
        if(answ8 == eihgtq){
            ++count;
        }
        //9
        System.out.println("question 9/20");
        System.out.println("how many legs does a spider have?");
        byte answ9 = in.nextByte(), ninq = 8;
        if(answ9 == ninq){
            ++count;
        }
        //10
        System.out.println("question 10/20");
        System.out.println("250 / 2 = ?");
        short answ10 = in.nextShort(), tenq = 125;
        if(answ10 == tenq){
            ++count;
        }
        //11
        System.out.println("question 11/20");
        System.out.println("the company headed by Gaven Belson in the TV series \"Silicon Valley\"?");
        String answ11 = in.nextLine();
        if(answ11 == "hooly"){
            ++count;
        }
        //12
        System.out.println("question 12/20");
        System.out.println("famous versatile tool that can be used for network research and security auditing");
        String answ12 = in.nextLine();
        if(answ12 == "nmap"){
            ++count;
        }
        //13
        System.out.println("question 13/20");
        System.out.println("a command to change access rights to files and dir's used in Unix-like OS");
        String answ13 = in.nextLine();
        if(answ13 == "chmod"){
            ++count;
        }
        //14
        System.out.println("question 14/20");
        System.out.println("secure network protocol for remote server management over the internet");
        String answ14 = in.nextLine();
        if(answ14 == "ssh"){
            ++count;
        }
        //15
        System.out.println("question 15/20");
        System.out.println("a programming language for storing and processing information in a relational database");
        String answ15 = in.nextLine();
        if(answ15 == "sql"){
            ++count;
        }
        //HTML
        //16
        System.out.println("question 16/20");
        System.out.println("hyper text markup language?");
        String answ16 = in.nextLine();
        if(answ16 == "html"){
            ++count;
        }
        //17
        System.out.println("question 17/20");
        System.out.println("cascading style sheets");
        String answ17 = in.nextLine();
        if(answ17 == "css"){
            ++count;
        }
        //18
        System.out.println("question* 18/20");
        System.out.println("a hierarchical decentralized naming system for internet-connected resources that maintains a" +
                "\nlist of domain names along with their numeric ip adresses or locations.");
        String answ18 = in.nextLine();
        if(answ18 == "dns"){
            ++count;
        }
        //19
        System.out.println("question** 19/20");
        System.out.println("a network protocol that allows network devices to automatically receive an IP address" +
                "\nand other parameters necessary to work in a TCP/IP network");
        String answ19 = in.nextLine();
        if(answ19 == "dhcp"){
            ++count;
        }
        //20
        System.out.println("question 20 - final");
        System.out.println("the second rule of fight club...");
        String answ20 = in.nextLine();
        if(answ20 == "dont mention fight club anywhere"){
            ++count;
        }
        if(count >= 10) {
            System.out.println("thank you for passing the test, your result a genius programming");
        }
        else{
            System.out.println("thank you for passing the test, try once more.");
        }
        in.close();
    }
}
