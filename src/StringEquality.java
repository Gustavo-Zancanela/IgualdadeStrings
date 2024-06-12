import java.util.Scanner;
public class StringEquality {
   
    public static void main(String[] args) 
    {
        String vdd = "Moe";
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Digite seu nome ");
         
        String usuario = sc.next();
       
        if(usuario.equals(vdd)) // compara se o nome é o mesmo da String vdd
        {
            System.out.println("Você é o rei do rock and roll");
        }
        else
        {
            System.out.println("Você não é o rei");
        }
                 sc.close();
         
    }
    
}


