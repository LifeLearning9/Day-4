# Day-4  longest palindromic substring
Given a string s, return the longest palindromic substring in s.

**Testcases:**
1. Input: s = "babad"     Output: "bab"

2. Input: s = "cbbd"      Output: "bb"

**Intution**
To enumerate all palindromic substrings of a given string, we first expand a given string at each possible starting position of a palindrome and also at each possible ending position of a palindrome and keep track of the length of the longest palindrome we found so far.
1. We observe that a palindrome mirrors around its center. Therefore, a palindrome can be expanded from its center, and there are only 2n - 1 such centers.
2. You might be asking why there are 2n - 1 but not n centers? The reason is the center of a palindrome can be in between two letters. Such palindromes have even number of letters (such as "abba") and its center are between the two 'b's.'
3. Since expanding a palindrome around its center could take O(n) time, the overall complexity is O(n^2).
   
**Algorithm :**
1.At starting we have maz_str = s[0] and max_len = 1 as every single character is a palindrome.
2.Now, we will iterate over the string and for every character we will expand around its center.
3.For odd length palindrome, we will consider the current character as the center and expand around it.
4.For even length palindrome, we will consider the current character and the next character as the center and expand around it.
5.We will keep track of the maximum length and the maximum substring.
6.Print the maximum substring.


**Complexity Analysis**
Time complexity : O(n^2). Since expanding a palindrome around its center could take O(n) time, the overall complexity is O(n^2).

Space complexity : O(1).
