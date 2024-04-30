public abstract class Pegawai{
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNoKTP(){
        return this.noKTP;
    }

    public String toString(){
        return String.format(""+getNama()+"\nNo. KTP\t\t: "+getNoKTP());
    }

    public abstract double gaji();


}