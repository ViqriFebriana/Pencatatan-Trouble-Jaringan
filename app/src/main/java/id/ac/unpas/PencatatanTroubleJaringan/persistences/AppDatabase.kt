package id.ac.unpas.PencatatanTroubleJaringan.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.PencatatanTroubleJaringan.model.SetoranTrouble

@Database(entities = [SetoranTrouble::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranTroubleDao(): SetoranTroubleDao
}
