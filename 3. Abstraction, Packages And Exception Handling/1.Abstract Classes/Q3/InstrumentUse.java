import java.util.Random;

public class InstrumentUse {
    public static void main(String[] args) {
        Instrument ins[] = new Instrument[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(3) + 1;
            switch (n) {
            case 1:
                ins[i] = new Piano();
                break;

            case 2:
                ins[i] = new Flute();
                break;

            case 3:
                ins[i] = new Guitar();
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (ins[i] instanceof Piano)
                System.out.print("Instrument " + i + " is of type Piano, ");
            if (ins[i] instanceof Flute)
                System.out.print("Instrument " + i + " is of type Flute, ");
            if (ins[i] instanceof Guitar)
                System.out.print("Instrument " + i + " is of type Guitar, ");
            ins[i].play();
        }
    }
}
