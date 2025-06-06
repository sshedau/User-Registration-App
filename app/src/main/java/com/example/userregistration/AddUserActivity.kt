package com.example.userregistration

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.userregistration.databinding.ActivityAddUserBinding
import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AddUserActivity : AppCompatActivity() {

    lateinit var addUserBinding : ActivityAddUserBinding

    val database : FirebaseDatabase = FirebaseDatabase.getInstance()
    val myReference : DatabaseReference = database.reference.child("MyUsers")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        addUserBinding = ActivityAddUserBinding.inflate(layoutInflater)
        val view = addUserBinding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        supportActionBar?.title = "Add User"

        addUserBinding.buttonAddUser.setOnClickListener {
            addUserToDatabase()
            finish()
        }

    }

    fun addUserToDatabase() {

        val name : String = addUserBinding.editTextName.text.toString()
        val age : Int = addUserBinding.editTextAge.text.toString().toInt()
        val email : String = addUserBinding.editTextEmail.text.toString()

        val id : String = myReference.push().key.toString()

        val user = User(id, name, age, email)

        myReference.child(id).setValue(user).addOnCompleteListener { task ->
            if(task.isSuccessful) {
                Toast.makeText(application,
                                "The new user has been added to the database",
                                Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(application,
                                task.exception.toString(),
                                Toast.LENGTH_LONG).show()
            }
        }

    }
}