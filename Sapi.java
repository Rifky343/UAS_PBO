public class Sapi extends Hewan {

    public Sapi(String namaHewan, String jenisHewan, int umurHewan) {
        super(namaHewan, jenisHewan, umurHewan);
    }

    public void dataHewan() {
        System.out.println("Nama hewan: " + getNamaHewan() + "\nJenis Hewan: " + getJenisHewan() + "\nUmur Hewan: "
                + getUmurHewan() + " Tahun");
    }

}