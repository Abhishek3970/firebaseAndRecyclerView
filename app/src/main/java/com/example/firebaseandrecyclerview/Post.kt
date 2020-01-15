package com.example.firebaseandrecyclerview

class Post {

    var title: String? = null
    var description: String? = null
    var author:String? = null

    constructor(){}

    constructor(title: String?, description: String?, author: String?) {
        this.title = title
        this.description = description
        this.author = author
    }
}