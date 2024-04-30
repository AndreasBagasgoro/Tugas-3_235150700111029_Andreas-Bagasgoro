public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Andreas Bagasgoro", "235150700111029", 5500000);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Silviani Sarah", "235150700111030", 4500000);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Athalia Audrey", "235150700111034", 6000000);
        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Antonio Usman", "235150700111031", 9500.0, 35);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Kumar Hatta", "235150700111032", 5000, 42);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("Amsman Nur", "235150700111035", 4500, 55);
        Sales sales1 = new Sales("Violita Mahadewi", "235150700111033", 50, 50000.0);
        Sales sales2 = new Sales("Pauline Vessa", "235150700111034", 75, 40000);
        Sales sales3 = new Sales("Ridwan Faizal", "235150700111036", 65, 45000);
        
        Pegawai[] pegawai = new Pegawai[9];
        pegawai[0]=pegawaiTetap1;
        pegawai[1]=pegawaiTetap2;
        pegawai[2]=pegawaiTetap3;
        pegawai[3]=pegawaiHarian1;
        pegawai[4]=pegawaiHarian2;
        pegawai[5]=pegawaiHarian3;
        pegawai[6]=sales1;
        pegawai[7]=sales2;
        pegawai[8]=sales3;
        
        for(int i=0;i<pegawai.length;i++){
            System.out.println(pegawai[i]);
            System.out.println();
        }




    }
}
