//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class queues {
    private int f,r,s;
    private int c;
    private int []q;
    public queues (int c) {
        this.c = c;
        f = 0;
        r = -1;
        s = 0;
        q= new int[c];
    }
    public void c(int item){
        if (s==c){
                System.out.println("queue is full");
                return;
        }
     r=(r-1)%c;
        q[r]=item;
        s++;
    }
    public int dequeue() {
        if (s == 0) {
            System.out.println("queue is empty");
            return -1;
        }
        int item = q[f];
        f = (f + 1) % c;
        s--;
        return -1;
    }
    public int peak(){
        if (s==0){
            System.out.println("queue is empty!...");
            return -1;
        }
        return q[f];

    }
}
