package id.ac.unpas.PencatatanTroubleJaringan.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.PencatatanTroubleJaringan.model.SetoranTrouble

@Dao
interface SetoranTroubleDao {
    @Query("SELECT * FROM SetoranTrouble")
    fun loadAll(): LiveData<List<SetoranTrouble>>

    @Query("SELECT * FROM SetoranTrouble WHERE id = :id")
    fun find(id: String): SetoranTrouble?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: SetoranTrouble)

    @Delete
    fun delete(item: SetoranTrouble)
}