import LinkList.*;

public class test {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.createNodeList();
        JudgmentPalindrome judgmentPalindrome = new JudgmentPalindrome();
        System.out.println(judgmentPalindrome.judge1(listNode.getNode()));
    }
}
