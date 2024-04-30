public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        setUpahPerjam(upahPerJam);
        setTotalJam(totalJam);
    }

    public double getUpahPerJam(){
        return upahPerJam;
    }

    public int getTotalJam(){
        return totalJam;
    }

    public void setUpahPerjam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }

    
    public String toString(){
        return String.format("Pegawai Harian\t: "+ super.toString() +"\nUpah/Jam\t: Rp "+getUpahPerJam()+"\nTotal jam kerja\t: "+getTotalJam()+".0\nPendapatan\t: Rp %.0f", gaji() );
    }

    public double gaji(){
        if(totalJam<=40){
            return getTotalJam()*getUpahPerJam();
        } else {
            return (40*getUpahPerJam()) + (getTotalJam()-40) * (getUpahPerJam()*1.5);
        }
    }
}
