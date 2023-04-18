package com.example.ebcsqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BDAPP(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    val create_users_table = "CREATE TABLE  Usuarios" +
                                "(ID INT PRIMARY KEY," +
                                " NOMBRE TEXT," +
                                " PASSWORD TEXT)"

    override fun onCreate(database: SQLiteDatabase?) {

        database?.execSQL(create_users_table)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }


}