/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

import java.awt.Color;
import java.util.Scanner;
import java.text.NumberFormat;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.*;

//import java.awt.Polygon;
/**
 *
 * @author artmabi21
 */

public class MyFirstApp { 
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        int[][] a = {{2,3,4},{3,5,7}};
        System.out.println(sum2D(a));
    }
    public static void day1(){
        printingPractice();
    }
        public static void printingPractice() {
            System.out.println("My name is ");
            System.out.print("name");
            System.out.print("and I love Java!!");
            System.out.print("Go ");
            System.out.print("Skyline ");
            System.out.print("Spartans!");
        }
    public static void day2(){
        printingEscapeSequencesPractice();
    }
        public static void printingEscapeSequencesPractice() {
            System.out.println("\ta\tb\tc");
            System.out.println("\"\"\"\"");
            System.out.println("'");
            System.out.println("C:\nin\the downward spiral");  
        }    
    public static void day2a(){
        printname();
        printaddress();       
    }  
        public static void printname(){
            System.out.println("Abby Artman");
        }       
        public static void printaddress(){
            System.out.println("ABC Se");
        }       
    public static void day3(){
        topshape();
        bottomshape();
        System.out.println("");
        bottomshape();
        divider();
        System.out.println("");
        topshape();
        stop();
        bottomshape();
        topshape();
        divider();
    }   
        public static void topshape(){
            System.out.println("  _______");
            System.out.println(" /       \\");
            System.out.println("/         \\");
        }       
        public static void bottomshape(){
            System.out.println("\\         /");
            System.out.println(" \\_______/");
        }   
        public static void divider(){
            System.out.println("+---------+");
        }      
        public static void stop(){
            System.out.println("|   STOP  |");
        }      
    public static void day4(){
        String str = "computersci";
            String empt= str.substring(0, 6);
            System.out.println(empt);
    }     
    public static void day5() {
        moduloPractice();
        tempConversion();
        reverser();
        mixingTypesPractice();
    } 
        public static void moduloPractice() {
            int n=47;
            int m=6;
            System.out.println(n%m);
        }       
        public static void tempConversion() {
            double f=74;
            double c=(f-32)*5/9;
            System.out.println(c);           
        }       
        public static void reverser() {
            int i=546;
            int big=i%10;
            int mid=i/10;
            int midd=mid%10;
            int end=mid/10; 
            System.out.print(big);
            System.out.print(midd);
            System.out.print(end);
        }       
        public static void mixingTypesPractice() {
            System.out.println(2.0 + 3);
            System.out.println( "1" + "2" );
            System.out.println('a' + 1);
            System.out.println(3 / 2 + 1.0);
            System.out.println("abc" + 1 + 2);
            System.out.println('A' + 1);
            System.out.println((1.0 + 3) /2);
            System.out.println(1 + "abc" + 2);
            System.out.println('e' - 'A');
        }       
    public static void day5a(){
        String in = "pickles";
        char first = in.charAt(0);
        first = (char) (first +3);
        char second = in.charAt(1);
        second = (char) (second +3);
        char third = in.charAt(2);
        third = (char) (third +3);
        char fourth = in.charAt(3);
        fourth = (char) (fourth +3);
        char fith = in.charAt(4);
        fith = (char) (fith +3);
        char sixth = in.charAt(5);
        sixth = (char) (sixth +3);
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
        System.out.print(fith);
        System.out.print(sixth);
        System.out.println((char)(in.charAt(6)+3));
    }  
    public static void day6() {
        average();
        shopPrice();
    }  
        public static void average(){
            double one = 4.8;
            double two = 6.2;
            double three = 8.4;
            one += two;
            one += three;
            one /= 3;
            System.out.println(one);    
        }       
        public static void shopPrice(){
            double pone =5.63;
            double ptwo =243.73;
            double pthree =256.98;
            double pfour =52.48;
            double pfive =1434.39;
            double total = pone + ptwo + pthree + pfour + pfive;
            double totalTax = total;
            totalTax /=100;
            totalTax *=10;
            total += totalTax;
            total += 9.95;      
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println(formatter.format(total));
        }       
    public static void day6a(){
	int st = 1;
	System.out.println(st);
	int tot =1;
	System.out.println(tot);
            for (int i = 1; i <=10; i++) {
                int en = st + tot;
		st = tot;
		tot = en;
		System.out.println(en);
            }
    }  
    public static void day7(){
        exone();
        extwo();
        exthree();
        exfour();
    }  
        public static void exone(){
            for (int i = 0; i < 999; i++){
                System.out.println("All work and no play makes Jack a dull boy");
            }
        }      
        public static void extwo(){
            double sum = 0;
            for (int i = 1; i <= 1000; i++) {
                sum += 1;
                System.out.println(sum);
            }
        }         
        public static void exthree(){
            int sum = 0;
            System.out.println(sum);
            for (int i = 1; i <=1000; i++){
                sum += i;
                System.out.println(sum);
            }
        }        
        public static void exfour(){
            int product = 1;
            for (int i = 1; i <=1000; i++) {
                product *= i;
                System.out.println(product);
            }
        }       
    public static void day7a(){
        tryx("CrazyApple",3);
        tryr("fudcbdssoh",3);
        tryop("Boing",3);
    }   
        public static void tryx(String in, int add){
            for (int i = 0; i < in.length(); i++) {
            char x = in.charAt(i);
            x = (char) (x + add );
            for (; x > 123 ;) {
                 x -= 26;
            }          
//            for (; x = 32 + add;) {
//            x = 32;       
//               }
            System.out.print(x);
            }            
            System.out.println("");
        }           
        public static void tryr(String in, int sub){
            for (int i = 0; i < in.length(); i++) {
            char x =in.charAt (i);
            x = (char) (x - sub);
//            for (; x > 97;){
//                x -= 32;
//            }
            for (; x < 97 ;) {
                x += 26;
            }           
            System.out.print(x);
            }
            System.out.println("");
        }        
        public static void tryop(String word,int add){
            String answer = "";
            for (int i = 0; i < word.length(); i++){
                answer += (char) (word.charAt(i)+ add);
            }            
            System.out.println(answer);       
            String reverse = "";
            for (int i = 0; i < 10; i++){
                reverse += (char) (answer.charAt(i)- add);
            }           
            System.out.println(reverse);
        }        
    public static void day8(){
        exuno();
        exunoa();
        exunob();
        exdose();
        extres();
        extresa();
        extresb();
        extresc();
        extresd();
        extrese();
    }   
        public static void exuno(){
            for (int i = 1; i < 6; i++){
                int num = i;
                String fin = "";        
                for (int j = 0; j < 5; j++){
                    fin += num;
                }                
            System.out.println(fin);
            }            
        }       
        public static void exunoa(){
            for (int i = 1; i < 6; i++){
                for (int j = 1; j < 6; j++){
                    System.out.print(j);
                }                
            System.out.println("");
            }            
        }       
        public static void exunob(){
            for (int i = 0; i < 5; i++){
                for (int j = 1; j < 6; j++){
                    System.out.print(j + i);
                }                
                System.out.println();
            }           
        }       
        public static void exdose(){
            for (int i = 1; i < 6; i++){
                for (int j = 1; j < 6; j++){
                    System.out.print("\t" + j*i);
                }               
                System.out.println();
            }           
        }       
        public static void extres(){
            for (int i = 1; i < 6; i++){
            System.out.print(" ");
                for (int j = 1; j <= i ; j++){
                    System.out.print(i);
                }
            System.out.println();
            }
        }      
        public static void extresa(){
        for (int i = 1; i < 6; i++){
            System.out.print(" ");
                for (int j = 1; j <= 6 - i ; j++){
                    System.out.print(6 - i);
                }                
            System.out.println();
            }        
        }       
        public static void extresb(){
            for (int i = 1; i < 6; i++){
            System.out.print(" ");
                for (int j = 1; j <= i ; j++){
                    System.out.print(j);
                }                
            System.out.println();
            }           
        }       
        public static void extresc(){
            for (int i = 1; i < 6; i++){
            System.out.print(" ");
                for (int j = 1; j <= 6 - i ; j++){
                    System.out.print(j + 1);
                }   
            System.out.println();
            }
        }       
        public static void extresd(){
            for (int i = 1; i < 6; i++){
            System.out.print(" ");
                for (int j = 1; j <= i ; j++){
                    char out = 64;
                    System.out.print((char)(out + j));
                }   
            System.out.println();
            }
        }       
        public static void extrese(){
            for (int i = 0; i < 6; i++){
                for (int j = 1; j <= 5 - i ; j++){
                    char put = 91;
                    System.out.print((char)(put - j));
                }   
            System.out.println();
            }
        }               
    public static void day8ab(){
        for (int i = 1; i < 6; i++){
            System.out.print(" ");
            for (int j = 1; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }   
    public static void day9() {
            int tab = 5;
            System.out.print("#");
            for (int m = 0; m < tab * 4; m++){
                 System.out.print("=");
            }   
            System.out.print("#");
            System.out.println("");
            for (int i = 0; i < tab; i++){
                System.out.print("|");
                for (int k = 0; k < tab - (i + 1); k++){
                    System.out.print("  ");
                }   
                System.out.print("<>");
                for (int l = 0; l < i * 2; l++){
                    System.out.print(".");
                }
                for (int j = 0; j < i * 2; j++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int m = 0; m < tab - (i + 1); m++) {
                    System.out.print("  ");
                }
            System.out.print("|");
            System.out.println();
            }
            for (int i = tab - 1; i > -1; i--) {
                System.out.print("|");
                for (int k = 0; k < tab - (i + 1); k++){
                    System.out.print("  ");
                }   
                System.out.print("<>");
                for (int l = 0; l < i * 2; l++){
                    System.out.print(".");
                }
                for (int j = 0; j < i * 2; j++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int m = 0; m < tab - (i + 1); m++) {
                    System.out.print("  ");
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.print("#");
           for (int m = 0; m < tab * 4; m++){
                 System.out.print("=");
            }
            System.out.print("#");
            System.out.println("");
        }   
    public static void day10(){
        intro();
        fourcal();
        interleave();
        returnprac();
        System.out.println(ceasershiftredub("apple",3));
    }   
        public static void intro(){
            System.out.println("Hello, what's your name?");
            System.out.print("> ");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();
            System.out.println("Nice to meet you, " + input);  
        }       
        public static void fourcal(){
            System.out.println("Enter first number");
            System.out.print("> ");
            Scanner keyboard = new Scanner(System.in);
            int fn = keyboard.nextInt();
            System.out.println("Enter secong number");
            System.out.print("> ");
            Scanner keyboardto = new Scanner(System.in);
            int sn = keyboardto.nextInt();
            System.out.println("It's " + (fn * sn));
        }       
        public static void interleave(){
            System.out.println("What's your first word?");
            System.out.print("> ");    
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();
            System.out.println("Whats's your secong word?");
            System.out.print("> ");
            Scanner keyboardto = new Scanner(System.in);
            String secinput = keyboardto.nextLine();
            for (int i = 0; i < input.length(); i++){
                System.out.print(input.charAt(i));
                System.out.print(secinput.charAt(i));
            }    
        }           
        public static void interleavecheck(){
            System.out.println("What's your first word?");
            System.out.print("> ");    
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();
            System.out.println("Whats's your secong word?");
            System.out.print("> ");
            Scanner keyboardto = new Scanner(System.in);
            String secinput = keyboardto.nextLine();
            for (int i = 0; i < input.length(); i++){
                System.out.print(input.charAt(i));
                System.out.print(secinput.charAt(i));
            System.out.println("What are you checking is interleaved?");
            System.out.print("> ");
            Scanner keyboardtoo = new Scanner(System.in);
            String scrambled = keyboardtoo.nextLine();
            System.out.println(!=  );
            } 
        }        
        public static void returnprac(){
            System.out.println(first() + " " + last());
            System.out.println(first() + " " + middle() + " " + last());
            System.out.println(first().charAt(0) + " " + last());
            System.out.println(last() + " " + first());
            System.out.println(last() + " " + first().charAt(0));
            System.out.println(last() + " " + first() + " " + middle().charAt(0));
            }        
        public static String first(){
            return "abby";
        }        
        public static String middle(){
            return "jia";
        }        
        public static String last(){
            return "artman";
        }        
        public static String ceasershiftredub(String word,int add){
            String answer = "";
            for (int i = 0; i < word.length(); i++){
                answer += (char) (word.charAt(i)+ add);
            }
            return answer;
        }        
    public static void day11() {
        loopprac();
        book(20, 35, 100);
        book(150, 70, 60);
        book(300, 10, 200);
    }   
        public static void loopprac(){
            DrawingPanel p =new DrawingPanel (200,150);
            Graphics g = p.getGraphics();
            for (int j = 0; j < 5; j++){
                g.drawRect(11 + 20 * j, 18, 20, 20);            
            }
            for (int i = 0; i < 5; i++){
                g.drawRect(11 + (11 * i), 98 - (5 * i), 11, 5);
            }  
        }        
        public static void book(int x, int y, int size){
            String inital = "AJA";
            DrawingPanel p =new DrawingPanel (520,240);
            Graphics g = p.getGraphics();
            g.setColor(Color.CYAN);
            g.fillRect (x, y, size, size);
            g.setColor (Color.WHITE);
            g.drawString(inital, x + 50, y + 20);
            Color brown = new Color(191, 118, 73);
            g.setColor (brown);
            for (int i = 0; i < 10; i++){
                g.fillRect(x, y + (size/10 *i), size/10 + (size/10*i), size/10 - 1);
            }
            
        }           
    public static void day12(){
            introd();
        }      
        public static void introd(){    
            System.out.println("Play a game or free play?");
            System.out.println("Relpy \"game\" or \"free\"");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            String play = keyboard.nextLine();
            if("game".equals(play)){
                fireProjectileGame();
            }
            
            if("free".equals(play)){
                freePlay();
            }
            
        }        
        public static void outtro(){
            System.out.println("Play again?");
            System.out.println("Relpy \"yes\" or \"no\"");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            String play = keyboard.nextLine();
            if("yes".equals(play)){
                intro();
            }
            
            if("no".equals(play)){
                System.out.println("Thanks for playing!");
            }
            
        }             
        public static void freePlay(){
            double a = getAngle();
            double v = getVelocity();
            double sx = getStartingX();
            double sy = getStartingY();
            double s = getSteps();
            fireProjectileFree(a, v, sx, sy, s);
        }             
        public static double getAngle(){
        System.out.println("Angle?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int angle = keyboard.nextInt();
        return angle;
        }        
        public static double getVelocity(){
        System.out.println("Velocity?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int velocity = keyboard.nextInt();
        return velocity;
        }           
        public static double getStartingX(){
        System.out.println("Inital X position?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int startingx = keyboard.nextInt();
        return startingx;
        }        
        public static double getStartingY(){
        System.out.println("Inital Y position?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int startingy = keyboard.nextInt();
        return startingy;
        }             
        public static double getSteps(){
        System.out.println("Number of steps?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int steps = keyboard.nextInt();
        return steps;
        }               
        public static void fireProjectileFree(double angle, double velocity, double startingx, double startingy, double steps){
            double GRAVITY = 9.81;
            DrawingPanel p = new DrawingPanel (550,550);
            Graphics g = p.getGraphics();
            p.setBackground(Color.BLACK);
//            g.setColor(Color.WHITE);
//            Polygon star = new Polygon();
//            star.addPoint(10, 90);
//            star.addPoint(25,30);
//            star.addPoint(40, 90); 
//           star.addPoint(25,60);
//            g.fillPolygon(star);        
            double vx = velocity * Math.cos(Math.toRadians(angle));
            double vy = -1 * (velocity * Math.sin(Math.toRadians(angle)));
            System.out.println(vx);
            System.out.println(vy);            
            double tFlight = -2 * (vy / GRAVITY);
            double dT = tFlight / steps;            
            for (int i = 0; i <= tFlight; i+= dT){
                double xpos = startingx + vx * i;
                double ypos = startingy + vy * i + 0.5 * GRAVITY * Math.pow(i, 2);
                System.out.println(xpos);
                System.out.println(ypos);
                g.setColor(Color.RED);
                g.fillOval((int)xpos, (int)(ypos), 10, 10);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.ORANGE);
                g.fillOval((int)xpos -2 , (int)(ypos), 9, 9);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.YELLOW);
                g.fillOval((int)xpos -2 , (int)(ypos), 8, 8);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.GREEN);
                g.fillOval((int)xpos -2 , (int)(ypos), 7, 7);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.CYAN);
                g.fillOval((int)xpos -2 , (int)(ypos), 6, 6);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.BLUE);
                g.fillOval((int)xpos -2 , (int)(ypos), 5, 5);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -5 , (int)(ypos - 2), 14, 14);                
                i += 1;
            }      
            
            outtro();
        }     
        public static void fireProjectileGame(){  
            double GRAVITY = 9.81;
            DrawingPanel p = new DrawingPanel (550,550);
            Graphics g = p.getGraphics();
            p.setBackground(Color.BLACK);           
            g.setColor(Color.WHITE);
            int gx = 400;
            int gy = (int) (Math.random() * 400);
            g.drawOval(gx, gy, 15, 15);         
            double angle = getAngle();
            double velocity = getVelocity();           
            double vx = velocity * Math.cos(Math.toRadians(angle));
            double vy = -1 * (velocity * Math.sin(Math.toRadians(angle)));
            System.out.println(vx);
            System.out.println(vy);           
            double tFlight = -2 * (vy / GRAVITY);
            double dT = tFlight / 10000;                
            for (int i = 0; i <= tFlight; i+= dT){
                double xpos = 0 + vx * i;
                double ypos = 500 + vy * i + 0.5 * GRAVITY * Math.pow(i, 2);
                System.out.println(xpos);
                System.out.println(ypos);
                g.setColor(Color.RED);
                g.fillOval((int)xpos, (int)(ypos), 10, 10);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.ORANGE);
                g.fillOval((int)xpos -2 , (int)(ypos), 9, 9);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.YELLOW);
                g.fillOval((int)xpos -2 , (int)(ypos), 8, 8);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.GREEN);
                g.fillOval((int)xpos -2 , (int)(ypos), 7, 7);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.CYAN);
                g.fillOval((int)xpos -2 , (int)(ypos), 6, 6);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -2 , (int)(ypos), 14, 14);
                g.setColor(Color.BLUE);
                g.fillOval((int)xpos -2 , (int)(ypos), 5, 5);
                p.sleep(200);
                g.setColor(Color.BLACK);
                g.fillOval((int)xpos -5 , (int)(ypos - 2), 14, 14); 
                i += 1;
            }
            
            p.setBackground(Color.WHITE);
            g.setColor(Color.BLACK);
            g.drawString("hit or miss? I guess they never miss huh?", 225, 225);
            p.sleep(200);
            p.setBackground(Color.BLACK);   
            outtro();
        } 
    public static void day13(){
        excone();
        exctwo();
        excthree();        
    }
        public static void excone() {
            System.out.println("Number?");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            int num = keyboard.nextInt();
            if (num % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
            
        }       
        public static void exctwo(){
            System.out.println("Word?");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            String word = keyboard.nextLine();
            System.out.println("Number?");
            System.out.print("> ");
            Scanner keyboardto = new Scanner (System.in);
            int num = keyboardto.nextInt();
            if (word.length() == num){
                System.out.println("equal to nember");
            }else if(word.length() < num){
                System.out.println("less than number");
            }else{
                System.out.println("more than number");
            }
            
        }       
        public static void excthree(){
            System.out.println("From 0 - 100 number?");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            int num = keyboard.nextInt();
            for (int i = 0; i < 100; i++)
            {
                if (num == i){
                    System.out.println((char)((i % 26) + 93));     
                }
                
            }
            
        }       
    public static void day14(){
        int num = introo();
        double sum = 0.0;
        if (num <= 0){
            System.out.println("Silly, you have to enter more than 0 numbers for this to work!");
            System.out.println("Lets try again...");
            introo();
            day14();
        }else{
            int rounds = num;
            for (int i = 0; i < rounds; i++){
                System.out.println("What is your " + (i + 1) + " number?");
                System.out.print("> ");
                Scanner keyboard = new Scanner (System.in);
                int numi = keyboard.nextInt();
                if (numi < 0){
                    num -= 1;
                }
                if(numi > 0) {
                    sum += numi;
                }
                
            }
            
        sum /= num;
        System.out.println("The average of all your numbers is...");
        System.out.println(sum);
        }
        
    }   
        public static int introo(){
        System.out.println("How many numbers are you going to enter?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int num = keyboard.nextInt();
        return num;
        }       
    public static void day14a(){
        xo(5);
        printRange(6, 6);
        System.out.println(rep1("hottopic", 3));
        System.out.println("How many numbers do you want to enter");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int num = keyboard.nextInt();
        smallestLargest(num);
    }   
        public static String rep1(String in, int n){
        String out = " ";
        if (n > 0){
            for (int i = 0; i < n; i++) {
                out += in;
            }
            
        }
        return out;
    }   
        public static void printRange(int n1, int n2){
        if (n1 < n2){
           for (int i = n1; i < (n2 + 1); i++) {
               System.out.print(i + " ");
           }  
        }else if (n1 == n2){
           System.out.println(n1);
        }else{
           for (int i = n1; i > (n2 - 1); i--) {
               System.out.print(i + " ");
           }           
        }
    }   
        public static void smallestLargest(int n){
        int smol = Integer.MAX_VALUE;
        int lrg = Integer.MIN_VALUE;
        if (n < 0){
            System.out.println("Silly, you cant enter less than 0 numbers for this to work!!");
        }else{
        for (int i = 1; i < n + 1; i++) {
            System.out.println("Number " + i + ":");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            int x = keyboard.nextInt();
            if (x < smol){
                smol =x;
            }
            if (x > lrg){
                lrg =x;
            }   
        }
            System.out.println("Smallest = " + smol);
            System.out.println("Largest = " + lrg);
        }
    }  
        public static void smallestLargestPV(){
        Scanner sc = new Scanner (System.in);
        System.out.println("How many numbers?");
        System.out.print("> ");
        if (sc.hasNextInt()){
            int count = sc.nextInt();
            sc.nextLine();
            System.out.println("enter the numbers seperated by spaces");
            System.out.print("> ");
            String input = sc.nextLine();
            Scanner tokens = new Scanner (input);
            int max = tokens.nextInt();
            int min = max;
            for (int i = 0; i < count - 1; i++){
                if (tokens.hasNextInt()){
                int num = sc.nextInt();
                if (num > max){
                    max = num;
                }
                if (num <min){
                  min = num;
                }
                }else{
                System.out.println("didnt find a number ");
                break;
            }   
                System.out.println("Smallest = " + min);
                System.out.println("Largest = " + max);
            }
        }else{
            System.out.println("not a number");
        }
}   
        public static void xo(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            if(i + j + 1== size){
                System.out.print("x");
            }else if(i - j == 0){
                System.out.print("x");
            }else{
                System.out.print("o");
            }
            }System.out.println("");
        }
    }  
    public static void day15(){
        System.out.println("Hey I need a sentence!!");
        String ws = words();
        char l = letter();
        System.out.println("there are " + hmanCheck(ws,l) + " \"" + l + "\"s in your sentence.");
    }    
        public static String words(){
        System.out.println("Your sentence?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        String words = keyboard.nextLine();
        words = words.trim().toLowerCase();
        if (words.isEmpty() == true){
            System.out.println("Silly, you have to enter a sentence, try again...");
            words();
        }
            return words;
    }    
        public static char letter(){
        System.out.println("A letter?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        String letter = keyboard.nextLine().trim().toLowerCase();
        if (letter.isEmpty() == true){
            System.out.println("Silly, you have to enter a letter, try again...");
//          letter();
            day15();
        }else if(letter.length() != 1){
            System.out.println("Silly, you have to enter a single letter, try again...");
//          letter();
            day15();
        }
        char lette = letter.charAt(0); 
        return lette;
    }    
        public static int hmanCheck(String words, char letter){
        int count = 0;
        for (int i = 0; i < words.length(); i++){
            if (words.charAt(i) == letter){
                count += 1;
            }    
        }        
        return count;
    }        
    public static void day16(){
        exer2ex();
    }    
        public static void exer1(){
       int n = 1;
        int sum = 0;
        while (n < 100){
            sum += n;
            n++;
        }
        System.out.println(sum); 
    }    
        public static void exer2(){
        int goal = (int)(Math.random() * 100 + 1);
        int g = 0;                
        do {
            System.out.println("guess?");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            g = keyboard.nextInt();
            if (g > goal){
                System.out.println("Too high");
            }
            if (g < goal){
                System.out.println("Too low");
            }
        } while (g != goal);
            System.out.println("Correct"); 
    }   
        public static void exer2ex(){
        System.out.println("your number?");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        int goal = keyboard.nextInt();
        int g = (int)(Math.random() * 100 + 1);     
        int n = 0;
        do {
        System.out.println("my guess is " + g);
        if (g > goal){
            System.out.println("Too high");
            g -= (int)(Math.random() * 10);
            n += 1;
        }
        if (g < goal){
            System.out.println("Too low");
            g += (int)(Math.random() * 10);
            n += 1;
        }
        } while (g != goal);
            System.out.println("my final guess is " + g);
            System.out.print("Correct ");
            System.out.print("that took " + n +" tries!");
    }
    public static void dayx(){
        String name = "";
        System.out.println("Try to guess " + name + "'s pie order");
        System.out.println("What type of crust?");
        System.out.println("regular or chocolate, respond with \"r\" or \"c\"");
        Scanner keyboard = new Scanner (System.in);
        String c = keyboard.nextLine().trim().toLowerCase();
        if (c.isEmpty() == true){
            
        }
        if(c.length() != 1){
            
        }
        System.out.println(c);
    }
    public static void day17(){
        int goal = (int)(Math.random() * 100 + 1);
        int g = 0;
        System.out.println("who is guessing first?");
        Scanner keyboardto = new Scanner (System.in);
        String nameone = keyboardto.nextLine();
        System.out.println("who is quessing second?");
        Scanner keyboardtoo = new Scanner (System.in);
        String nametwo = keyboardtoo.nextLine(); 
        int c1 = 0;
        int c2 = 0;
        do {
            do{
                System.out.println( nameone + "'s guess?");
                System.out.print("> ");
                Scanner keyboard = new Scanner (System.in);
                g = keyboard.nextInt();
                if (g > goal){
                    System.out.println("Too high");
                }
                if (g < goal){
                    System.out.println("Too low");
                }
                c1 += 1;
                if (g == goal){
                    break;
                }
            } while (c2 > c1);
                System.out.println( nametwo + "'s guess?");
                System.out.print("> ");
                Scanner keyboard = new Scanner (System.in);
                g = keyboard.nextInt();
                if (g > goal){
                    System.out.println("Too high");
                }
                if (g < goal){
                    System.out.println("Too low");
                }
                c2 += 1;
        } while (g != goal);
            System.out.println("Correct");
            if (c1 > c2){
                System.out.println(nameone + " wins");
            }
            if (c1 == c2){
                System.out.println(nametwo + " wins");
            }
    }
    public static void day18(){
        int input = 0;
        int sum = 0;
        do{
            System.out.println("enter a number");
            System.out.print("> ");
            Scanner keyboard = new Scanner (System.in);
            if (keyboard.hasNextInt()){
                input = keyboard.nextInt();
                System.out.println("great, ill add it now");
            }else{
                System.out.println("didnt find a number");
                keyboard.nextLine();
            }
            if (input < 0){
            sum += input;
            }
        } while (input < 0);
        System.out.println(sum);
    }
    public static void day19(){
        arrayQuickInitializationPractice();
    }
        public static void ArrayPrac(){
           int[] numbers = new int[10];
           numbers[0] = 0;
           numbers[1] = 1;
           numbers[2] = 2;
           numbers[3] = 3;
           numbers[4] = 4;
           numbers[5] = 5;
           numbers[6] = 6;
           numbers[7] = 7;
           numbers[8] = 8;
           numbers[9] = 9;
           System.out.println(numbers[numbers.length]);
           for (int i = 0; i < numbers.length; i++){
           System.out.print(numbers[i] + " ");
           }
        } 
        public static void arrayFibPractice(){           
            int[] num = new int[10];
            System.out.print(num[0] = 1);
            System.out.print(" ");
            System.out.print(num[1] = 1);
            System.out.print(" ");
            for (int i = 2; i < num.length; i++) {
                num[i] = num[i-1] + num[i-2];
                System.out.print(num[i] + " ");
            }
        }
        public static void arrayWeatherPractice(){
            System.out.println("How many days are being compiled?");
        System.out.print("> ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("Please enter the temperatures seperated by spaces");
        System.out.print("> ");
        Scanner scc = new Scanner (System.in);
        String t = scc.nextLine();
        Scanner tc = new Scanner (t);
        
        int[] temps = new int [n];
        
        for (int i = 0; i < n; i++) {
            temps[i] = tc.nextInt();
        }       
        double ave = 0;
        for (int i = 0; i < temps.length; i++) {
            ave += temps[i];
        }
        ave = ave/temps.length;
        System.out.println("average temp= " + ave);
        
        int count= 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > ave){
                count++;
            }
        }
        System.out.println(count + " days were above average");
        }
        public static void arrayQuickInitializationPractice() {
            int[] arr = {4,1,7,2,9,3};
            arr = Arrays.copyOf(arr, arr.length + 10);
            System.out.println(Arrays.toString(arr));
        }
    public static void day20() {
        int[] arr = {11, 42, -5, 27, 0, 89};
        System.out.println(Arrays.toString(reverserArray(arr)));
                    
        int[] ar = {4, 2, 9, 13, 1};
        System.out.println(Arrays.toString(ar));
        int placeH = ar[0];
        for (int i = 0; i < ar.length-1; i++)
        {
            ar[i] = ar[i+1];
        }
        ar[ar.length-1] = placeH;
        System.out.println(Arrays.toString(ar));
        int[] a = {4, 2, 9, 13, 1};
        System.out.println(Arrays.toString(a));  
        placeH = a[a.length-1];
        for (int i = a.length-1; i > 0; i--)
        {
           a[i] = a[i-1];
        }
        a[0] = placeH;
        System.out.println(Arrays.toString(a));
    }
        public static int[] reverserArray(int[] num) {
            System.out.println(Arrays.toString(num));
            int n = num.length/2;
            if (1 == num.length % 2){
                n--;
            }
            for (int i = 0; i < n; i++)
            {
                int place = num[i];
                num[i] = num[num.length-1-i];
                num[num.length-1-i] = place;
            }
            return num;
        }
    public static void day21() {
        String[] words = {"here", "we", "are", "now,", "entertain", "us"};
        System.out.println(compileStringArray(words));
    }
        public static String compileStringArray(String[] str) {
            String compiled = "";
            for (int i = 0; i < str.length-1; i++) {
                compiled += str[i];
                compiled += " ";
            }
            return compiled;
        }
    public static void day22() {
 //       int[] a = {12, 34, 56};
  //      int[] b = {20, 50, 80};
  //      int c = 1; 
  //      int d = 2;
  //      ArrayParameterPracticeSwap(a, c, d);
   //     System.out.println("");
  //      ArrayParameterPracticeSwapAll(a, b);
   //     System.out.println("");
   //     ArrayParameterPracticeExtra(a, b, c, d);
   //     System.out.println("");
        int[] a1 = {12, 34, 56};
        int[] a2 = {7, 8, 9, 10};
    //    ArrayParameterPracticeMerge(a1, a2);
  //      System.out.println("");
       int[] a3 = {444, 222, -1};
  //      ArrayParameterPracticeMerge3(a1, a2, a3);
  //      System.out.println("");
    }
        public static void ArrayParameterPracticeExtra(int[] one, int[] two, int red, int blue) {
            int dot = 0;
            for (int i = 0; i < one.length-1; i++) {
                if (red == i) {
                    dot = one[red];
                    one[red] = two[blue];
                    two[blue] = dot;
                }
            }
            System.out.println(Arrays.toString(one));
            System.out.println(Arrays.toString(two));
        }
        public static void ArrayParameterPracticeSwap(int[] one, int red, int blue) {
            int dot = 0;
            for (int i = 0; i < one.length-1; i++) {
                if (red == i) {
                    dot = one[red];
                    one[red] = one[blue];
                    one[blue] = dot;
                }
            }
            System.out.println(Arrays.toString(one));
        }
        public static void ArrayParameterPracticeSwapAll(int[] one, int[] two) {
            int dot = 0;
            for (int i = 0; i < one.length-1; i++) {
                dot = one[i];
                one[i] = two[i];
                two[i] = dot;
            }
            System.out.println(Arrays.toString(one));
            System.out.println(Arrays.toString(two));
        }
        public static void ArrayParameterPracticeMerge(int[] one, int[] two) {
            int n = one.length + two.length;
            int[] t = new int[n];
        System.arraycopy(one, 0, t, 0, one.length);
            for (int i = 0 + one.length; i < two.length + one.length; i++) {
                t[i] = two[i - one.length];
            }
            System.out.println(Arrays.toString(t));
        }
        public static void ArrayParameterPracticeMerge3(int[] one, int[] two, int[] three) {
             int n = one.length + two.length + three.length;
            int[] t = new int[n];
        System.arraycopy(one, 0, t, 0, one.length);
            for (int i = 0 + one.length; i < two.length + one.length; i++) {
                t[i] = two[i - one.length];
            }
            for (int i = 0 + one.length + two.length; i < two.length + one.length + three.length; i++) {
                t[i] = three[i - one.length - two.length];
            }
            System.out.println(Arrays.toString(t));
        }
    public static void day22a() {
        System.out.println("enter a series of numbers");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        String input = keyboard.nextLine();
        System.out.println(arrayPracticeTally(input));
    }
        public static int arrayPracticeTally(String o) {
            int n = 0;
            int[] arr = new int[10];
            for (int i = 0; i < o.length(); i++)
            {
                int a = (int) o.charAt(i);
                for (int j = 0; j < 10; j++) {
                   if (a == j + 1) { 
                       arr[j]++;
                   } 
                }
            }
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] > n){
                    n = arr[i];
                }
            }
            return n;
        }
    public static void day23() {
        Scanner sc = new Scanner(new File("testscores.txt"));
        String c = sc.toString();
        arrayPracticeTestScoreTally(c);
        
        System.out.println("enter a sentence");
        System.out.print("> ");
        Scanner keyboard = new Scanner (System.in);
        String input = keyboard.nextLine().trim().toLowerCase();
        System.out.println(arrayPracticeLetterTally(input));
    }   
        
        public static String arrayPracticeLetterTally(String o) {
            int[] arr = new int[26];
            for (int i = 0; i < o.length(); i++)
            {
                int a = (int) o.charAt(i);
                a -= 96;
                for (int j = 0; j < 26; j++) {
                   if (a == j + 1) { 
                       arr[j]++;
                   } 
                }
            }
            return Arrays.toString(arr);
        }
        public static void arrayPracticeTestScoreTally(String p) {
            int n = p.length();
            String q = p;
            int count = 0;
            int [] arr = new int[n];
            Scanner sc = new Scanner (p);
            while (sc.hasNextInt()) {
                int m = sc.nextInt();
                for (int j = 0; j < n; j++) {
                   if (m == j + 1) { 
                       arr[j]++;
                   }
                }
                if (q.contains(m)) {
                    count++;
                    if (count > 2) {
                        q = q.substring(count, count);
                    }
                }
            }
            int q = 
            System.out.println(q);
            System.out.print(": ");
            for (int i = 0; i < arr[i]; i++)
            {
                System.out.println("*");
            }
        }
        public static void arrayPracticeTestScoreTally2(String p) {
            int[] score = new int[101];
            Scanner sc = new Scanner (p);
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                score[n]++;
            }
        }
    public static void day24() {
        int[][] y = new int[4][5];
        for (int i = 0; i < y.length; i++) { 
            for (int j = 0; j < y[i].length; j++){  
                int roll = (int)(Math.random() * 6 + 1);
                y[i][j] = roll;
            }
            System.out.println(Arrays.toString(y[i]));
        }
    }
    
    public static void day25() {
        boolean mg = true;
        while (mg == true) {
            System.out.println("Enter a game score:");
            Scanner sc = new Scanner (System.in);
            if (sc.toString().trim().equals("quit")) {
                break;
            }
            Game g = new Game();
            g.date = sc.next();
            g.homeTeam = sc.next();
            g.homeS = sc.next();
            g.awayTeam = sc.next();
            g.awayS = sc.next();
            int aS = Integer.parseInt(g.awayS);
            int hS = Integer.parseInt(g.homeS);
            if (hS > aS) {
                System.out.print(g.homeTeam);
                System.out.print(" won at ");
                System.out.print(g.homeTeam);
            }
            if (hS < aS) {
                System.out.print(g.awayTeam);
                System.out.print(" won at ");
                System.out.print(g.homeTeam);
            }
            if (hS == aS) {
                System.out.print(g.homeTeam);
                System.out.print(" tied with ");
                System.out.println(g.awayTeam);
                System.out.println(" at ");
                System.out.println(g.homeTeam);
            }
            System.out.println("");
        }   
    }
    
    public static void day26() {
        System.out.println("How many games?");
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        Game g = new Game();
        String[][] table = new String[n][5];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a game score:");
            Scanner sc = new Scanner (System.in);
            g.date = sc.next();
            g.homeTeam = sc.next();
            g.homeS = sc.next();
            g.awayTeam = sc.next();
            g.awayS = sc.next();
            table[i][0] = g.date;
            table[i][1] = g.homeTeam;
            table[i][2] = g.homeS;
            table[i][3] = g.awayTeam;
            table[i][4] = g.awayS;
        }
        for (int j = 0; j < table.length-1; j++) {
            int hS = Integer.parseInt(table[j][2]);
            int aS = Integer.parseInt(table[j][4]);
            int hS1 = Integer.parseInt(table[j+1][2]);
            int aS1 = Integer.parseInt(table[j+1][4]);
            if ((hS- aS) > (hS1 - aS1)) {
                table[j+1][2] = table[j][2];
                table[j+1][4] = table[j][4];
            }
        }
        System.out.println("The game with the biggest point defferential was:");
        System.out.println(Arrays.toString(table[n]));
    }
        public static void oOPPractice() {
            System.out.println("please enter in the course's information:");
            Scanner sc = new Scanner (System.in);
            Course newc = Course.readFromInput(sc.toString());
//            Course c = new Course("English", "Parker", "2010", "3", false);
            
        }
    public static void day27() {
        Point p = new Point(10,10);
        Ball b = new Ball(5, p, 3, 45);
        Point p1 = new Point(0,0);
        Point p2 = new Point(100,100);
        Container box = new Container(p1,p2);
        while(true) {
            p = b.move();
            System.out.println(p.getX() + " " + p.getY());
            box.collidesWith(b);
        }
    }	public static int sum2D(int[][] arr){
			int sum = 0;
			int count = 0;
			do{
				for(int i = 0; i < arr.length; i++){
					sum += arr[count][i];
				}
				count++;
			} while (count < arr[0].length);
			return sum;
	}
    public static void day28(){
        
    }
}

