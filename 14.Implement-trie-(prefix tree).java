import java.util.HashMap;

import java.util.Map;

public class Trie {
    class Node{
        Map<Character, Node> children;
        boolean endOfWord;

        Node(){
            children = new HashMap<>();
            endOfWord = false;
        }

        void addIfAbsent(char ch){
            children.putIfAbsent(ch, new Node() );
        }

        Node get(char ch){
            return children.get(ch);
        }

        boolean present(char ch) {
            return children.containsKey(ch);
        }

    }
    Node head = new Node();


    public Trie() {

    }

    /** Inserts a word into the trie. */
    public  void insert(String word) {
        char[] w = word.toCharArray();
        Node pointer = head;
        for (char ch : w) {
            pointer.addIfAbsent(ch);
            Node node = pointer.get(ch);
            pointer = node;
        }
        pointer.endOfWord = true;
    }

    /** Returns if the word is in the trie. */
    public  boolean search(String word) {
        Node pointer = head;
        char[] w = word.toCharArray();
        for (char ch : w) {
            if (pointer.present(ch)) {
                pointer = pointer.get(ch);
            }else{
                return false;
            }
        }
        return pointer.endOfWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public  boolean startsWith(String prefix) {
        Node pointer = head;
        char[]  w = prefix.toCharArray();
        for (char ch : w) {
            if (pointer.present(ch)) {
                pointer = pointer.get(ch);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));

    }
}
