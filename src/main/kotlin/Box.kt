class Box<T>(initValue: T) {
    public var value: T = initValue

    override fun toString() : String = value.toString()
}