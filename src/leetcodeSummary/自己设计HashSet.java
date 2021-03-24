package leetcodeSummary;


/*void add(key) 向哈希集合中插入值 key 。
bool contains(key) 返回哈希集合中是否存在这个值 key 。
void remove(key) 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
*/
public class 自己设计HashSet {
    private int size;
    private Integer[] integers;
    public 自己设计HashSet(int size) {
        this.size=size;
        integers = new Integer[size];
    }

    public boolean contain(Integer key){
        for (int i=0;i<size;i++)
            if (integers[i].equals(key))
                return true;
        return false;
    }

    public void add(Integer key){
        if (contain(key));
        else{

        }
    }
}
