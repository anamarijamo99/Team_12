package com.team12.myopensecret

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues
import android.content.res.ColorStateList
import android.database.Cursor
import android.database.sqlite.SQLiteException
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import java.util.*
import kotlin.collections.ArrayList

class EditEntryActivity : AppCompatActivity() {

    private lateinit var titleField: EditText
    private lateinit var notesField: EditText
    private lateinit var labelsGroup: ChipGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SettingsActivity.loadLocale(this)
        setContentView(R.layout.activity_edit_entry)

        setTitle(R.string.edit_entry)

    }


}