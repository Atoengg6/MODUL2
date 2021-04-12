package modul_2;

import java.util.Scanner;

class rentalvcd {
    public String judul, publisher;
    int stok;
    
    rentalvcd (String judul, String publisher, int stok){
        this.judul = judul;
        this.publisher = publisher;
        this.stok = stok;
    }
    rentalvcd(){
        
    }
}

class cdfilm extends rentalvcd {
    String aktor, sutradara, katagori; 
    
    cdfilm (String aktor, String sutradara, String katagori, String judul, String publisher, int stok){
        super(judul, publisher, stok);
        this.aktor = aktor;
        this.sutradara = sutradara;
        this.katagori = katagori;
    }
    cdfilm(){
        
    }
}

        
public class Modul_2 {

    public static void main(String[] args) {
        
        
        int ulang,pil;
        do {
            Scanner input = new Scanner(System.in);
            cdfilm film = new cdfilm();
            System.out.println("=================================");
            System.out.println("=========== RENTAL VCD ==========");
            System.out.println("=================================");
        
            System.out.println("masukan data film");
            System.out.print("Judul               : ");
            film.judul = input.nextLine();
            System.out.print("Aktor               : ");
            film.aktor = input.nextLine();
            System.out.print("Sutradara           : ");
            film.sutradara = input.nextLine();
            System.out.print("publisher           : ");
            film.publisher = input.nextLine();
            System.out.println("Katagori          : ");
            System.out.println("1. semua umur");
            System.out.println("2. dewasa");
            System.out.println("3. remaja");
            System.out.println("4. anak-anak");
            System.out.print("masukan pilihan     : ");
        
            pil = input.nextInt();
            switch(pil) {
                case 1 :
                    film.katagori = "semua umur";
                    break;
                case 2 :
                    film.katagori = "dewasa";
                    break;
                case 3 :
                    film.katagori = "remaja";
                    break;
                case 4 :
                    film.katagori = "anak-anak";
                    break;
                default:
                    System.out.println("maaf pilihan tidak tersedia");
                    return;
            }
            System.out.print("Stok : ");
            film.stok = input.nextInt();
            
            System.out.println("=================================");
            System.out.println("=========== DAFTAR FILM =========");
            System.out.println("=================================");
            System.out.println("judul           :"+ film.judul);
            System.out.println("aktor           :"+ film.aktor);
            System.out.println("sutradara       :"+ film.sutradara);
            System.out.println("katagori        :"+ film.katagori);
            System.out.println("stok            :"+ film.stok);
            
            System.out.println("ulang lagi? :1.(ya)/2.(no)");
            ulang = input.nextInt();
        }while(ulang<2);
         
    }
}