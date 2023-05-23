package com.example.foodie.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foodie.models.FoodRecipe
import com.example.foodie.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity (
    var foodRecipe: FoodRecipe
        ){
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}