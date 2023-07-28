package ru.netology.nmedia.model

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likes: Int,
    var shared: Int,
    var views: Int,
    var likedByMe: Boolean
)


