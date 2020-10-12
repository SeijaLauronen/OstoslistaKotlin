package com.example.ostoslista.database

//SSL 11.10.2020 impotiy kopsattu mallista
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
/**
 * Defines methods for using the Kategory class with Room.
 */
@Dao //SSL: tämä pitää muistaa laittaa!!
interface KategoryDao {
    @Insert
    suspend fun insert(night: Kategory)

    /**
     * When updating a row with a value already set in a column,
     * replaces the old value with the new one.
     *
     * @param night new value to write
     */
    @Update
    suspend  fun update(night: Kategory)

    /**
     * Selects and returns the row that matches the key.
     *
     * @param key  to match
     */
    @Query("SELECT * from kategory_table WHERE kategoryId = :key")
    suspend fun get(key: Int): Kategory?
    /**
     * Deletes all values from the table.
     *
     * This does not delete the table, only its contents.
     */
    @Query("DELETE FROM kategory_table")
    suspend fun clear()

    /**
     * Selects and returns all rows in the table,
     *
     */
    @Query("SELECT * FROM kategory_table ORDER BY kategoryId DESC")
    fun getAll(): LiveData<List<Kategory>>

}