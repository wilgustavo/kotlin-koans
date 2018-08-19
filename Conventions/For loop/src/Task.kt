class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateIterador(start, end)
}

class DateIterador(start: MyDate, private val endInclusive: MyDate): Iterator<MyDate> {

    private var current = start
    override fun hasNext(): Boolean = current <= endInclusive

    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
