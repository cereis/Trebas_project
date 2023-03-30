/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assigment;

import java.util.Scanner;
public class Assigment {
    public void calculaterubbish(float males, float females, float litters, float deposits) {
        float total = males + females;
        float rubbishMales, rubbishFemales;
        rubbishMales = (males/total) * ((litters/total)*100);
        rubbishFemales = (females/total) * ((litters/total)*100);
        System.out.println("Number of rubbish males is: " + rubbishMales);
        System.out.println("The total number of rubbish females is: " + rubbishFemales);
    }
    public static void main(String[] args) {
        float totalMale, totalFemale, totalDeposit, totalLitter;

        Scanner scan = new Scanner(System.in);
        Assigment dof = new Assigment();
        System.out.println("Enter the total of males: ");
        totalMale = scan.nextInt();
        System.out.println("Enter the total of females: ");
        totalFemale = scan.nextInt();
        System.out.println("Enter the total who deposits: ");
        totalLitter = scan.nextInt();
        System.out.println("Enter the total who litters: ");
        totalDeposit = scan.nextInt();

        dof.calculaterubbish(totalMale, totalFemale, totalLitter, totalDeposit);
    }
}