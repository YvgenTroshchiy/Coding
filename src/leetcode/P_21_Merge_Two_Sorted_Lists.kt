package leetcode

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

/*
Input: 1->2->4,
       1->3->4
Output: 1->1->2->3->4->4
*/
fun main(args: Array<String>) {
    testCase1()
    println()

    testCase2()
    println()

    testCase3()
}

private fun testCase1() {
    val first1 = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(4)
        }
    }
    val second1 = ListNode(1).apply {
        next = ListNode(3).apply {
            next = ListNode(4)
        }
    }
    val r1 = mergeTwoLists(first1, second1)
    printList(r1)
}

private fun testCase2() {
    val first2 = ListNode(1).apply {
        next = ListNode(10).apply {
            next = ListNode(40)
        }
    }
    val second2 = ListNode(1).apply {
        next = ListNode(5).apply {
            next = ListNode(6)
        }
    }
    val r2 = mergeTwoLists(first2, second2)
    printList(r2)
}

private fun testCase3() {
    val first2 = ListNode(1).apply {
        next = ListNode(4).apply {
            next = ListNode(5)
        }
    }
    val second2 = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(6)
            }
        }
    }
    val r2 = mergeTwoLists(first2, second2)
    printList(r2)
}

fun printList(r1: ListNode?) {
    r1?.let { listNode ->
        print("${listNode.`val`} ")
        listNode.next?.let {
            printList(it)
        }
    }
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    return when {
        (l1 == null) -> l2
        (l2 == null) -> l1
        (l1.`val` < l2.`val`) -> {
            l1.next = mergeTwoLists(l1.next, l2)
            l1
        }
        else -> {
            l2.next = mergeTwoLists(l1, l2.next)
            l2
        }
    }
}