import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)


class RepeteadTimeInterval(val timeInterval: TimeInterval, val number: Int)
operator fun TimeInterval.times(times: Int) = RepeteadTimeInterval(this, times)
operator fun MyDate.plus(repeteadTimeInterval: RepeteadTimeInterval) = addTimeIntervals(repeteadTimeInterval.timeInterval, repeteadTimeInterval.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
