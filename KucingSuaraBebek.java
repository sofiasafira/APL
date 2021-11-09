public class KucingSuaraBebek implements Kucing {
    private Bebek bebek;

    public KucingSuaraBebek(Bebek bebek)
    {
        this.bebek = bebek;
    }

    @Override
    public void suara()
    {
        bebek.suara();
    }
}
