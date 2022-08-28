package com.example.pokemonapp.model.repository

import com.example.pokemonapp.model.data.PokemonList
import com.example.pokemonapp.model.datasource.PokemonApiService

class PokeMonRepository(
    private val pokemonApiService: PokemonApiService
) {
    suspend fun getAllPokemon() : PokemonList{
        return pokemonApiService.getPokemon()
    }
}