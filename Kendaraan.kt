package logitech

abstract class Kendaraan(
    val idKendaraan: String,
    val platNomor: String,
    val kapasitasBebanKg: Double, 
    var statusOperasional: String
) {
    abstract fun hitungBiayaOperasional(jarakTempuhKm: Double): Double
    abstract fun lakukanPemeliharaan(jarakTempuhKm: Double): String

    open fun tampilkanInfo(): String {
        return "[$idKendaraan] Plat: $platNomor | Kapasitas: $kapasitasBebanKg kg | Status: $statusOperasional"
    }
}
