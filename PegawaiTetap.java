public class PegawaiTetap extends Pegawai{
    private double upah;
    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        setUpah(upah);
    }

    public double getUpah(){
        return upah;
    }

    public void setUpah(double upah){
        this.upah = upah;
    }


    public String toString(){
        return String.format("Pegawai Tetap\t: "+super.toString()+"\nUpah\t\t: "+gaji()+"\nPendapatan\t: Rp %.0f",gaji());
    }

    public double gaji(){
        return getUpah();
    }
    
}
