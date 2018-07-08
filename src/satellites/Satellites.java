/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satellites;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class Satellites {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of lines you want");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> ar = new ArrayList<>();
        System.out.println("Please input 3 instructions for every line");

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] ss = s.split(" ");            
            if (ss[0].equals(ss[1]) || ss[1].equals(ss[2]) || ss[0].equals(ss[2])) {
                ar.add(ss[0]);
            } else if (ss[0].equals(ss[1])) {
                ar.add(ss[0]);
            } else if (ss[0].equals(ss[2])) {
                ar.add(ss[0]);
            } else if (ss[1].equals(ss[2])) {
                ar.add(ss[1]);
            } else {
                ar.add("???");
            }

        }
        //for (int i = 0; i < n; i++) {
            System.out.println("Your Instructions are"+ar);
        //}
    }

}
