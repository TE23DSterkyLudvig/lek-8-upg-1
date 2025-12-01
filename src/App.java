import Djurrr.*;


public class App {
    public static void main(String[] args) throws Exception 
    {

        Djur[] djuren = new Djur[5];

        djuren[0] = new Hund ();
        djuren[1] = new Hund ();
        djuren[2] = new Katt ();
        djuren[3] = new Katt ();
        djuren[4] = new Mus ();

        for (Djur djur : djuren) 
        {
           String lätet = djur.läte();
           System.out.println(lätet);
        }

        for (Djur djuris : djuren)
        {
            if( djuris instanceof Hund)
            {
                Hund.Spåra("kanin");
            }
            else if( djuris instanceof Katt)
            {
                Katt.leka("garn");
            }
            else if(djuris instanceof Mus)
            {
                Mus.klättra();
            }




            
            
        }
    }
}
