package com.example.data_binding_09653

object FakeRepository {
    private val fruitNames: List<String> = listof(
        "Apel", "mangga", "Pisang", "Anggur", "Stroberi'
        "Jambu", "Raspberi", "Bambu", "Kiwi", "Pir"

}
private val currentRandomFruitName = Mutable LiveData<String>()
val currentRandomFruitName: LiveData<String>
    get() = _currentRandomFruitName
init {
    _currentRandomFruitName.value = fruitNames.first(
)
    fun getRandomfruitName(): String {
        val random = Random.nextInt (fruitNames.size)
        return fruitNames [random]
}
    fun changeCurrentRandomFruitName() {
        _currentRandomFruitName.value = getRandomfruitName()
}


}

