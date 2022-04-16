public class ClassicFactory extends Building {
    int speed;
    int usage;
    int drain;
    // type pas nécessaire car il est de type electric pour toutes usines classiques

    public ClassicFactory(int u, int d, int s, String name) {
        super(name);
        usage = u;
        drain = d;
        speed = s;

    }

    public ClassicFactory(int u, int d, String name) {
        super(name);
        usage = u;
        drain = d;
        speed = 1;
    }

    public String toString() {
        return "Usine Classic  : " + name + ", usage : " +usage + ", drain : " +drain + ", speed : "+speed;
    }
}
