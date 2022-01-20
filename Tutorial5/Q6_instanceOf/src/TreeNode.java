public class TreeNode implements Node{
    int data;

    TreeNode(int data){
        this.data = data;
    }

    public void print(){
        System.out.println("data: " + data);
    }
}
