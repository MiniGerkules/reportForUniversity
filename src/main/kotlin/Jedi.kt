class Jedi {
    override fun equals(other: Any?): Boolean = other is Jedi
    override fun hashCode(): Int = 1
}