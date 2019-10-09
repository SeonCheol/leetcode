class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        var idx = 0
        val subsets = mutableListOf<List<Int>>(listOf())
        while (idx < nums.size) {
            val curVal = nums.get(idx)
            var subIdx = 0
            val subsetCopy = mutableListOf<List<Int>>()
            subsetCopy.addAll(subsets)
            while (subIdx < subsetCopy.size) {
                val subset = subsetCopy.get(subIdx)
                val newSubSet = mutableListOf(curVal)
                newSubSet.addAll(subset)
                subsets.add(newSubSet.toList())
                subIdx++
            }
            
            idx++
        }
        return subsets
    }
}
