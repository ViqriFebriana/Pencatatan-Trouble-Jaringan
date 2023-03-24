package id.ac.unpas.PencatatanTroubleJaringan.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SetoranTrouble(
    @PrimaryKey val id: String,
    val tanggal: String,
    val nama: String,
    val alamat: String,
    val kerusakan: String,

)
