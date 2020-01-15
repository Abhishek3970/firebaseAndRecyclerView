package com.example.firebaseandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.FirebaseDatabase
import com.firebase.ui.database.FirebaseRecyclerOptions



class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val options = FirebaseRecyclerOptions.Builder<Post>()
            .setQuery(FirebaseDatabase.getInstance().reference.child("Post"), Post::class.java)
            .build()

        adapter = PostAdapter(options)
        recyclerView.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        adapter.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapter.stopListening()
    }

}
