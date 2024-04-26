package com.adso.marvelapp.data

import com.adso.marvelapp.model.Superheroe

class DataSource {
    fun getSuperHeroes():MutableList<Superheroe>{
        var superheroes: MutableList<Superheroe> = mutableListOf()
        superheroes.add(Superheroe("Spiderman","Marvel","Peter Parker","https://i.ebayimg.com/images/g/4J0AAOSwNZ1i~QxG/s-l1600.webp"))
        superheroes.add(Superheroe("Daredevil","Marvel","Matthew","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTh29-FX4l5yORDPPhGzkZ9iMTPfu7JPFKaOuBFceO2Kg&s"))
        superheroes.add(Superheroe("Wolverine","Marvel","James Ho","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTv-_vGroeY5DWZc_7Q3corbp9-E-MeljhuR__AAk3EOw&s"))
        superheroes.add(Superheroe("Batman","DC","Bruce Wayne","https://www.lavanguardia.com/files/article_main_microformat/uploads/2017/04/10/5fa3c6ca21373.jpeg"))
        superheroes.add(Superheroe("Thor","Marvel","Thor Odinson","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqDCRcbKtiFlPavdDhliuGzc6Ooy9BUzBKUQNK937vnQ&s"))
        superheroes.add(Superheroe("Flash","DC","Jay Garrick","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStwdhNDwwn0w47Q4CTTy6h2u6NbxkdvmKDOg2MGS8naQ&s"))
        superheroes.add(Superheroe("Superman","LJ","Clack Ken","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhVxBZOrCEL3SJAV_u-Q07McvAPtFWGPlvvQfmeNg37g&s"))

        return superheroes

    }
}