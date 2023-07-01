public class Goal {
    public int i;
    public int j;

    public Goal(int i, int j){
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString(){
        return String.format("[%s][%s]",i ,j);
    }
}
