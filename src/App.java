import Djurrr.*;


public class App {
    public static void main(String[] args) throws Exception 
    {

        Djur[] djuren = new Djur[6];

        Hund hund = new Hund ();
        djuren[0] = hund;
        Hund hund2 = new Hund ();
        djuren[1] = hund2;
        Katt katt1 = new Katt ();
        djuren[2] = katt1;
        Katt katt2 = new Katt ();
        djuren[3] = katt2;
        Mus musen = new Mus ();
        djuren[4] = musen;
        Hund hund3 = new Hund();
        djuren[5] = hund3;


        for (Djur djur : djuren) 
        {
           String lätet = djur.läte();
           System.out.println(lätet);
        }

        for (Djur djuris : djuren)
        {
            if( djuris instanceof Hund hundis)
            {
                hundis.Spåra("kanin");
                
            }
            if( djuris instanceof Katt katt)
            {
                katt.leka("garn");
            }
            if(djuris instanceof Mus mus)
            {
                mus.klättra();
            }




            hund3.sitt();
            hund3.apport();
            hund3.kom();



            
            
        }
    }
}
