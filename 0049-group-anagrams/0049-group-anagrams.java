class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Declaring a hashmap;
        Map<String,List<String>> map = new HashMap <>();
        for(String word:strs){  //Traversing the array strs
            char[] arr = word.toCharArray();   //converting word into character
            Arrays.sort(arr);     // sorting all the character 

            String key_word = new String(arr);   // new string created

            map.putIfAbsent(key_word, new ArrayList<>());
            map.get(key_word).add(word);

        }
        return new ArrayList<>(map.values());
        
    }
}
    
