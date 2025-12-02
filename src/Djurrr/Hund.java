package Djurrr;


public class Hund extends Djur implements Dressera 
{
    public Hund ()
    {
        super(5, 20000, true);
    }

    @Override
    public void äta(int energi)
    {
        this.energi += 1000;
    }

    @Override
    public void spring(int meter)
    {
        this.energi = energi-energi*(1/8);

        if (this.energi <= 0)
        {
            this.lever = false;
            System.out.println("Död");
        }
    }

    @Override
    public  String läte()
    {
       return "Hunden skjäller";
    }

    public void Spåra(String mål)
    {
        if( mål == "kanin")
        {
            System.out.println("Spårar "  + mål);
        }
    }

    @Override
    public void sitt()
    {
        System.out.println("Sitt");
    }

    @Override
    public void apport()
    {
        System.out.println("apport");
    }

    @Override
    public void kom()
    {
        System.out.println("kom");
    }
}
