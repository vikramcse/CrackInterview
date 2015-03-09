package Module_1.Exercise_1;

/**
 * This code is for checking whether a string has all unique characters or not!
 * W/O using any data structure
 */
public class UniqueString {

    // So this is the brute force approach where first item is checked against all the items
    // The running time is bad because of two loops O(pow(n,2))
    public Boolean checkForUniqueBruteForce (String str) {
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            while (j < str.length()) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
                else
                    j++;
            }
        }
        return true;
    }

    // Here the idea is first consider an array of length 26, then initialize all elements to 0
    // find the character value position in array by substracting a from current char.
    // then if the chatValue position is array is zero then element found first time
    // else element repeated then return false
    public Boolean checkForUniqueUsingArray (String str) {
        int array[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            array[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            int charVal = str.charAt(i) - 'a';
            if (array[charVal] == 0)
                array[charVal] = 1;
            else
                return false;
        }
        return true;
    }
}
