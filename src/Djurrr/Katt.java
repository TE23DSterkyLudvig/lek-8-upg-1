package Djurrr;

public class Katt extends Djur {
    

    public Katt()
    {
        super(5,10000,true);
    }


        @Override
    public void äta(int energi)
    {
        this.energi += 500;
    }

    @Override
    public void spring(int meter)
    {
        this.energi = energi-energi*(1/16);

        if (this.energi <= 0)
        {
            System.out.println("Död");
        }
    }

    @Override
    public String läte()
    {
        return "Miaooooooooo";
    }

    public void leka(String sak)
    {
        if(sak == "garn")
        {
            System.out.println("Leker med " + sak);
        }
    }
}
