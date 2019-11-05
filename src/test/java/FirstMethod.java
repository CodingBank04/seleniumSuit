import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class FirstMethod {
    static void printHello(int number){
        for (int i=0 ; i<number; i++){
            System.out.println("HELLO WORLD");
        }
    }

    public static void main(String[] args) {
        FirstMethod.printHello(10);
    }

}
