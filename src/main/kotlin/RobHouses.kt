fun main() {
    val s = Solution()
    print(s.rob(intArrayOf(2, 7, 9, 3, 1)))
}

class Solution {

    private val mem: HashMap<Pair<Int, Int>, Int> = hashMapOf()

    private lateinit var nums: IntArray

    fun rob(nums: IntArray): Int {

        this.nums = nums

        return dp(0 to nums.size - 1)

    }

    private fun dp(memoryKey: Pair<Int, Int>): Int {

        mem[memoryKey]?.let {
            return it
        }

        if (memoryKey.second - memoryKey.first == 0) {
            return nums[memoryKey.first]
        }

        if (memoryKey.second - memoryKey.first == 1) {
            return Math.max(nums[memoryKey.first], nums[memoryKey.second])
        }

        val ans = Math.max(
            dp(
                memoryKey.first to memoryKey.second - 2
            ) + nums[memoryKey.second],
            dp(
                memoryKey.first to memoryKey.second - 1
            )
        )

        mem[memoryKey] = ans

        return ans
    }

}
