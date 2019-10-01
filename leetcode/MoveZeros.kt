class Solution {
    fun moveZeroes(nums: IntArray): Unit {
       var curIdx = 0
        var zeroCounts = 0
        var zeroFirstIdx = 0
        
        while ( curIdx < nums.size ) {
            val curVal = nums.get(curIdx)
            
            if (curVal === 0) {
                if (zeroCounts === 0) {
                    zeroFirstIdx = curIdx
                }
                zeroCounts++
            } else {
                if (zeroCounts !== 0) {
                    nums.set(zeroFirstIdx, curVal)
                    nums.set(curIdx, 0)
                    zeroFirstIdx++
                }
            }
            curIdx++
        }
    }
}

