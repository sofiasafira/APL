class Main {
    public static void main(String[] args)
    {
        Bebek pelari = new BebekHitam();
        Kucing  anggora = new Anggora();
        Kucing bebekKucing = new KucingSuaraBebek(pelari);
    
        System.out.println("Bebek Hitam bersuara");
        pelari.suara();

        System.out.println("Kucing Anggora bersuara");
        anggora.suara();
    
        System.out.println("Kucing Anggora bersuara");
        bebekKucing.suara();
    }
}
