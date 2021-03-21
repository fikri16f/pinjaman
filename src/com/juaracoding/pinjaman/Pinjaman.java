package com.juaracoding.pinjaman;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Pinjaman {


    public static void main(String[] args) {
    	
    	
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	Date tgl = null;
    	
        //Set Tanggal Secara Manual
        Calendar cal3 = Calendar.getInstance();
        
    	
    	
        Scanner masukan = new Scanner(System.in);
        int pinjaman, lamaAngsuran, bunga, angsuran, pembayaran,bungaPokok;
		int tanggal;
        
        
//        System.out.println("Masukkan Tanggal : ");
//        
        
        System.out.print("Masukkan besar pinjaman : ");
        pinjaman = masukan.nextInt();

        System.out.print("Masukkan lama angsuran (bulan) : ");
        lamaAngsuran = masukan.nextInt();

        System.out.print("Masukkan besar bunga (%) : ");
        bunga = masukan.nextInt();

        angsuran = pinjaman/lamaAngsuran;
        bungaPokok = pinjaman * bunga / 100;

        for(int i=0; i<lamaAngsuran; i++){
        	
//        	tgl = sdf.parse("05/03/2011");
//        	cal3.setTime(tgl);
//			cal3.add(Calendar.DAY_OF_MONTH, 30);
//			System.out.println("Tgl Jatuh Tempo: "+sdf.format(cal3.getTime()));
        	
           pembayaran = angsuran + bungaPokok;
           System.out.println("Pembayaran bulan ke-"+(i+1)+" = ");
           pinjaman = pinjaman - angsuran;
           System.out.println("bayar Pokok = "+ angsuran);
           System.out.println("Bunga Pokok = "+ bungaPokok);
           System.out.println("Total Tagihan = "+ pembayaran);
           System.out.println("sisa Pembayaran = "+ pinjaman);
        }
          
        }


	}
