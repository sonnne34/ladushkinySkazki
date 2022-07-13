package com.ladushkinySkazky.ladushkinnyskazki.domian.usecases

import com.ladushkinySkazky.ladushkinnyskazki.domian.SkazkyListRepository
import com.ladushkinySkazky.ladushkinnyskazki.domian.model.SkazkiModel

class GetItemSkazkaUseCase(private val skazkyListRepository: SkazkyListRepository) {

    fun getItemSkazka(itemSkazkaId: Int): SkazkiModel {
        return skazkyListRepository.getItemSkazka(itemSkazkaId)
    }
}