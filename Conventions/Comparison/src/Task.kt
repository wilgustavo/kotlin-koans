data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (other.year != this.year) {
            return this.year - other.year
        }
        if (other.month != this.month) {
            return this.month - other.month
        }
        return this.dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
