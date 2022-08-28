package com.example.pokemonapp.model.datasource

import com.example.pokemonapp.model.data.PokemonList
import retrofit2.http.DELETE
import retrofit2.http.GET

interface PokemonApiService {

    @GET("pokemon")
    suspend fun getPokemon(): PokemonList

    @DELETE("{/id}")
    suspend fun deletePokemon(id: Int)
}