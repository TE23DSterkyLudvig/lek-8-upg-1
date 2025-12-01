package Djurrr;

public class Mus extends Djur
{
    
   public Mus()
    {
        super(1,5000,true);
    }


        @Override
    public void äta(int energi)
    {
        this.energi += 250;
    }

    @Override
    public void spring(int meter)
    {
        this.energi = energi-energi*(1/32);

        if (this.energi <= 0)
        {
            System.out.println("Död");
        }
    }

    @Override
    public String läte()
    {
        return "pip";
    }

    public static void klättra()
    {
        System.out.println("Mus klättrar");
    }
}


