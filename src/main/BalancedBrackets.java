package main;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     *
     **/

    //  unbalanced test strings   "][", "]", "Launch]Code[", "[LaunchCode", "]La,La, La, [Love] is all you need["
    // 4 output lines to show ch found and brackets current value for debugging, uncomment if needed.

    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                //System.out.println(" Ordered Left Bracket '[' found, Brackets = " + brackets + " ch = " + ch);
            } else if (ch == ']') {
                brackets--;
                //System.out.println(" Ordered Right Bracket ']' found, Brackets = " + brackets + " ch = " + ch);
            }

            if (brackets == -1) {
                //System.out.println("Unordered Bracket '][' came first, Brackets = " + brackets + " ch = " + ch);
                break;
            }
        }
        //System.out.println("Loop finished. Final value of brackets is: " + brackets);
        return brackets == 0;
    }
}
