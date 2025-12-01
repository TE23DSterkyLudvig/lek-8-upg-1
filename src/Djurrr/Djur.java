package Djurrr;


public abstract class Djur 
{

    protected double vikt;
    protected int energi;
    protected boolean lever;
    private static int antal_djur = 0;

    public Djur (double vikt, int energi, boolean lever)
    {
        if ( vikt <= 0 )
        {
            throw new IllegalArgumentException("högre eller lika med 1 kg!");
        }

        if ( energi < 0)
        {
            throw new IllegalArgumentException("Över 0 i energi!");
        }

        this.vikt = vikt;
        this.energi = energi;
        antal_djur ++;
        this.lever = true;
    }
    
    public void äta(int energi)
    {

    }

    public void spring(int meter)
    {

    }

    public String läte()
    {
        return "";
    }

}
