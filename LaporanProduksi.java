import java.util.ArrayList;
import java.util.List;

class LaporanProduksi {
    private List<Produksi> dataProduksi;

    public LaporanProduksi() {
        dataProduksi = new ArrayList<>();
    }

    public void tambahProses(Produksi proses) {
        dataProduksi.add(proses);
    }

    public void tampilkanLaporan() {
        System.out.println("Laporan Produksi:");
        for (Produksi proses : dataProduksi) {
            proses.catatHasilProduksi();
        }
    }

    public void filterLaporan(String jenisHewan, String periode) {
        System.out.println("Laporan untuk Jenis Hewan: " + jenisHewan + ", Periode: " + periode);
        for (Produksi proses : dataProduksi) {
            if (proses.getJenisHasil().equalsIgnoreCase(jenisHewan)) {
                proses.catatHasilProduksi();
            }
        }
    }
}
