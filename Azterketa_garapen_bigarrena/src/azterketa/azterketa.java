package azterketa;

import java.util.Scanner;

public class azterketa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int batura = 0;
        int aukera = 1;  
        int kontadorea = 0;

        while (aukera != 0) {
            System.out.println("Sartu zenbaki bat:");
            aukera = sc.nextInt();
            batura = batura + aukera;
            kontadorea++;
        }

        
        int batazbestekoa = (kontadorea != 0) ? batura / kontadorea : 0;

        System.out.println("Batazbestekoa: " + batazbestekoa);
    }
}