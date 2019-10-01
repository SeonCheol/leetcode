class Solution {
    fun dailyTemperatures(T: IntArray): IntArray {
          val resultArray = IntArray(T.size)

        var idx = T.size - 1

        while ( idx >= 0 )  {
            var curIdx = idx + 1
            var days = 0
            while(curIdx < T.size) {
                val curVal = T.get(curIdx)
                val curDays = resultArray.get(curIdx)

                if (curVal > T.get(idx)) {
                    days = curIdx - idx
                    curIdx++
                    break
                } else if (curDays == 0) {
                    days = 0
                    break
                } else {
                    curIdx += curDays
                }
            }
            resultArray.set(idx, days)
            idx--
        }
        return resultArray
    }
}
