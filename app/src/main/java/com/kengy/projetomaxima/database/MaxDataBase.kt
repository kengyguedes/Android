package com.kengy.projetomaxima.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kengy.projetomaxima.database.entity.EntityCliente
import com.kengy.projetomaxima.database.entity.EntityContato
import com.kengy.projetomaxima.database.entity.EntityLegendaPedido
import com.kengy.projetomaxima.database.entity.EntityPedido

@Database(
    entities = [EntityPedido::class, EntityCliente::class, EntityContato::class, EntityLegendaPedido::class],
    version = 11,
    exportSchema = false
)
abstract class MaxDataBase : RoomDatabase() {

    abstract fun Dao(): PedidoDao
    //abstract fun Dao(): ClienteDao

    companion object {
        var INSTANCE: MaxDataBase? = null

        fun getInstance(context: Context): MaxDataBase {

            return if (INSTANCE == null) {

                INSTANCE = Room.databaseBuilder(
                    context,
                    MaxDataBase::class.java,
                    "databaseMaxPed.db"
                ).build()

                INSTANCE as MaxDataBase
            } else
                INSTANCE as MaxDataBase
        }
    }


}