package leetcodeSummary;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/*
* 给一非空的单词列表，返回前 k 个出现次数最多的单词。

返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。

示例 1：

输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
输出: ["i", "love"]
解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
    注意，按字母顺序 "i" 在 "love" 之前。
 

示例 2：

输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
输出: ["the", "is", "sunny", "day"]
解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
    出现次数依次为 4, 3, 2 和 1 次。
*/
public class 第k个高频单词 {

    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new FileReader("S:\\IDEA\\SuanFa\\src\\leetcode\\1.txt"));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s=r.readLine())!=null)
        {
            sb.append(s);
        }
        String[] s1 = sb.toString().split(" ");
        System.out.println(f1(s1, 10));
    }

    // 使用Treemap
    public static List<String> f(String[] strings, int k)
    {
        TreeMap<String,Integer> map = new TreeMap<>();
        for (int i=0;i<strings.length;i++){
            map.put(strings[i],0);
        }
        for (int i=0;i<strings.length;i++){
            if (map.containsKey(strings[i])){
                map.put(strings[i],map.get(strings[i])+1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        List<String> l = new ArrayList<>();
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue()>o2.getValue()) return -2;
                else if(o1.getValue()< o2.getValue()) return 1;
                else {
                    if (o1.getKey().compareTo(o2.getKey())>0) return 1;
                    else if (o1.getKey().compareTo(o2.getKey())<0) return -1;
                    else return 0;
                }
            }
        });
        for (int i=0;i<k;i++){
            l.add(list.get(i).getKey());
        }
        return l;
    }
    // 使用大堆
    public static List<String> f1(String[] strings, int k)
    {
        Map<String, Integer> map = new HashMap<>(strings.length);
        for (String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> heap = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer i1 = map.get(o1);
                Integer i2 = map.get(o2);
                if (i1>i2){
                    return -1;
                }else if (i1<i2) return 1;
                else return 0;
            }
        });
        heap.addAll(map.keySet());
        ArrayList<String> l = new ArrayList<>();
        for (int i=0;i<k;i++){
            l.add(heap.poll());
        }
        return l;
    }
}
