package logitech
fun main() {
    println ("========================================"Logitech express"===========================================")

    // membuat daftar armada
    //  100 - 120  kode untuk mobil
    //  200 - 220  kode untuk motor
    // 300 - 320  kode untuk truk
    val daftarArmada = arrayListOf<Kendaraan>()
    daftarArmada.add(MobilPengirim("100", "B 1006 MM", 540.0, "Beroperasi", 43.0, 5)) //avanza
    daftarArmada.add(MobilPengirim("101", "B 1404 MM", 490.0, "Beroperasi", 36.0, 5))  //sigra
    daftarArmada.add(MotorKurir("212", "B 0409 JJ", 167.0, "Beroperasi", "Thermal Insulated", 6.6)) //NMAX lama
    daftarArmada.add(MotorKurir("213", "B 0409 JJ", 167.0, "Beroperasi", "Thermal Insulated", 7.1)) //NMAX baru
    daftarArmada.add(TrukKargo("319", "B 1309 TN", 18000.0, "Beroperasi", 3, 18.0)) //tronton wingbox //10 roda (2 roda di sumbu depan dan 8 roda di sumbu belakang dengan konfigurasi 3 sumbu: 2 - 4 - 4).
    daftarArmada.add(TrukKargo("320", "B 2509 PTN", 8000.0, "Beroperasi", 2, 8.0)) //Fuso Bak // (2 roda di sumbu depan dan 4 roda di sumbu belakang / double).

    var totalBiayaOperasional = 300
        // Perulangan Polimorfisme
    daftarArmada.forEach { Kendaraan ->
        val jarak = 100
        println(Kendaraan.tampilkanInfo())
        val 
        println("Biaya Operasional : Rp ${Kendaraan.hitungBiayaOperasional(jarak)}")
        println("Laporan Pemeliharaan: ${Kendaraan.lakukanPemeliharaan(jarak * 50)}")
        println("------------------------------------------------------")
    }
}
