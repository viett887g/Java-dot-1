/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import static javaapplication2.javabaitap1.san_sinh_mang;
import static javaapplication2.javabaitap1.tim_kiem;

/**
 *
 * @author ADMIN
 */

public class javabaitap1 {
    public static List<Integer> san_sinh_mang(int n){
	List<Integer>mang = new ArrayList<>();
        for (int i=1;i<=n;i++){
            Random numrandom = new Random();
            int so_ngau_nhien = numrandom.nextInt(-100,100);
            mang.add(so_ngau_nhien);
        }
        return mang;
    }

    public static int tim_kiem(List<Integer> mang ,int  x){
        int n= mang.size();
        for (int i=1 ; i<=n; i++ ){
            int index = mang.get(i);
            if (index==x){
                return i;
        } 
    }   
        return -1;
    } 
    
    public static void main(String[] args){
        List<Integer> mang = san_sinh_mang(100);
        System.out.println("mang duoc sinh ra la" + mang);
        Collections.sort(mang);
        System.out.println("mang duoc sap xep la la" + mang);
        System.out.println("nhap vao so ban muon tim kiem");
        Scanner x1 = new Scanner(System.in);
        String m2  = x1.nextLine();
        int x = Integer.parseInt(m2);
        
        int vi_tri_1 = tim_kiem(mang,x);       
        
        if (vi_tri_1 != -1){
            System.out.println(x + "duoc tim thay tai vi tri" + vi_tri_1);
        }
        else{
            System.out.println(x +"khong xuat hien trong mang");
        }
        
    }
}
