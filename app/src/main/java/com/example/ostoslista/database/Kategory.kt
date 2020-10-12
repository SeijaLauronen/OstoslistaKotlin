package com.example.ostoslista.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kategory_table")
data class Kategory (    //SSL huom, tässä piti sulut muuttaa erilaiseksi {} -> ()
    @PrimaryKey(autoGenerate = true)
    var kategoryId :Int = 0,

    @ColumnInfo(name = "kategoryName")
    val kategoryName: String = "",

    @ColumnInfo(name = "inUse")
    val kategoryInUse: Boolean

)