package com.example.kakaosearchapi.model

data class SearchResponse(
    val documents: List<Document>,
    val meta: Meta
)