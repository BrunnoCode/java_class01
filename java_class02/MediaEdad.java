import java.util.Scanner;

public class MediaEdad{
   public static void main(String[] args){
		System.out.println("Que edad tiene tu padre?");
		    Scanner edadPadres = new Scanner(System.in);
		    int padre = edadPadres.nextInt();
		    System.out.println("Que edad tiene tu madre?");
		    int madre = edadPadres.nextInt();
		    edadPadres.close();
		    int mediaEdad = padre+madre;
		    System.out.println("La media de Edad entre tus padres es: " + mediaEdad/2);
	    }
    }