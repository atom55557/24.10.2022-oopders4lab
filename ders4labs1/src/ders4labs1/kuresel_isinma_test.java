package ders4labs1;

import java.util.Scanner;

public class kuresel_isinma_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sorular=new int[5][1];
		int toplam=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Küresel ISINMA testi...");
		
		System.out.println("1. Hangi ülke en çok sera gazı yaymaktadır?");
		System.out.println("1.Cin 2.Hindistan 3.Amerika 4.Japonya");
        sorular[0][0]=scan.nextInt(); 
        if(sorular[0][0]==1) {
            System.out.println("Dogru.");
        	toplam++;}
        else
        	System.out.println("Yanlis.");
        
		System.out.println("2. Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
		System.out.println("1.Jupiter 2.Venus 3.Mars 4.Merkur");
        sorular[0][0]=scan.nextInt(); 
        if(sorular[1][0]==2) {
            System.out.println("Dogru.");
        	toplam++;}
        else
        	System.out.println("Yanlis.");
        
		System.out.println("3. İklim değişikliği nedeniyle yılda kaç kişi ölmektedir?");
		System.out.println("1.1500 2.100.000 3.150.000 4.500.000");
        sorular[2][0]=scan.nextInt(); 
        if(sorular[2][0]==3) {
            System.out.println("Dogru.");
        	toplam++;}
        else
        	System.out.println("Yanlis.");
        
		System.out.println("4. Küresel ısınmaya karşı en savunmasız hayvan hangisidir?");
		System.out.println("1.Kar Leopari 2.Kutup Ayisi 3.Deniz Gergedani 4.Tukan");
        sorular[3][0]=scan.nextInt(); 
        if(sorular[3][0]==3) {
            System.out.println("Dogru.");
        	toplam++;}
        else
        	System.out.println("Yanlis.");
        
		System.out.println("5. Kirlilik havaya yayıldıkça ne azalır?");
		System.out.println("1.Ozon tabakasi 2.okyanslar 3.yagmur ormanlari 4.karbondioksit");
        sorular[4][0]=scan.nextInt(); 
        if(sorular[4][0]==1) {
            System.out.println("Dogru.");
        	toplam++;}
        else
        	System.out.println("Yanlis.");
        
        switch(toplam) {
        case 5:
        	System.out.println("Mukemmel.Dogru sayiniz="+toplam);
        	break;
        case 4:
        	System.out.println("Cok iyi.Dogru sayiniz="+toplam);
        	break;
        case 3:
        	System.out.println("Kuresel isinma hakkindaki bilgilerinizi tazelemeliniz.Dogru sayiniz="+toplam);
        	break;
        case 2:
        	System.out.println("Kuresel isinma hakkindaki bilgilerinizi tazelemeliniz.Dogru sayiniz="+toplam);
        	break;
        case 1:
        	System.out.println("Kuresel isinma hakkindaki bilgilerinizi tazelemeliniz.Dogru sayiniz="+toplam);
        	break;	
        case 0:
        	System.out.println("Kuresel isinma hakkindaki bilgilerinizi tazelemeliniz.Dogru sayiniz="+toplam);
        	break;	
        }	
        System.out.println("Sorulara verdiginiz cevaplar..=");
        for(int i=0;i<5;i++)
        {
        	System.out.printf(" %d.soru =%d",i+1,sorular[i][0]);
        }
	}

}
