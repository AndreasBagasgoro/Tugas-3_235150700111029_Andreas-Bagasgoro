public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        setKomisi(komisi);
        setPenjualan(penjualan);

    }

    public int getPenjualan(){
        return this.penjualan;
    }

    public double getKomisi(){
        return this.komisi;
    }

    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi){
        this.komisi = komisi;
    }

    public String toString(){
        return String.format("Sales\t\t: "+super.toString()+"\nTotal Penjualan\t: "+getPenjualan()+".0\nBesaran Komisi\t: "+getKomisi()+"\nPendapatan\t: Rp %.0f",gaji());
    }
    public double gaji(){
        return getPenjualan()*getKomisi();
    }


}
