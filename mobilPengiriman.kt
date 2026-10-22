package logitech

class MobilPengirim(
    idKendaraan: String,
    platNomor: String,
    kapasitasBebanKg: Double,
    statusOperasional: String,
    val kapasitasBbmLiter: Double,
    val jumlahPintu: Int
) : Kendaraan(idKendaraan, platNomor, kapasitasBebanKg, statusOperasional) {

    override fun hitungBiayaOperasional(jarakTempuhKm: Double): Double {
        val tarifPerKm = 3000.0
        val biayaFixedHarian = 50000.0
        return biayaFixedHarian + (jarakTempuhKm * tarifPerKm)
    }

    override fun lakukanPemeliharaan(jarakTempuhKm: Double): String {
        return if (jarakTempuhKm >= 10000.0) {
            "Mobil $idKendaraan memerlukan servis berkala (Ganti oli mesin & cek rem)."
        } else {
            "Mobil $idKendaraan dalam kondisi baik."
        }
    }

    override fun tampilkanInfo(): String {
        return "${super.tampilkanInfo()} | Tipe: Mobil ($jumlahPintu Pintu, BBM: ${kapasitasBbmLiter}L)"
    }
}
