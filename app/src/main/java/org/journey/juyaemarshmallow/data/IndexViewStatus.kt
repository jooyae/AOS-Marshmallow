package org.journey.juyaemarshmallow.data

object IndexViewStatus {
    private val allSkinTypes = arrayOf("oily", "dry", "sensitive")
    //default
    var currentSkinType = allSkinTypes[0]
    set(skinTypeIndex){
        field = allSkinTypes[skinTypeIndex.toInt()]
    }
    var currentSearchKeyWord : String?= null
}