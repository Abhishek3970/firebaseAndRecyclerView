package com.example.firebaseandrecyclerview


import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions


class PostAdapter(options: FirebaseRecyclerOptions<Post>) : FirebaseRecyclerAdapter<Post, PostAdapter.PostViewHolder>(options) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.post, parent, false))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int, post: Post) {
        holder.title.text = post.title
        holder.description.text = post.description
        holder.author.text = post.author
    }

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title :TextView = itemView.findViewById(R.id.title)
        var description: TextView = itemView.findViewById(R.id.description)
        var author: TextView = itemView.findViewById(R.id.author)

    }
}