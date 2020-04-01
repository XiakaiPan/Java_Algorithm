/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
        /*
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * alpha;
        }
        return a;*/
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) c[i] = a[i];
            else c[i] = b[i - a.length];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] longer = new double[Math.max(a.length, b.length)];
        double[] shorter = new double[Math.max(a.length, b.length)];
        double[] sum = new double[longer.length];
        if (a.length > b.length) {
            for (int i = 0; i < a.length; i++) {
                longer[i] = a[i];
                if (i < b.length) shorter[i] = b[i];
                else shorter[i] = 0;
            }
        }
        else {
            for (int i = 0; i < b.length; i++) {
                longer[i] = b[i];
                if (i < a.length) shorter[i] = a[i];
                else shorter[i] = 0;
            }
        }
        for (int i = 0; i < longer.length; i++) {
            sum[i] = longer[i] + shorter[i];
        }
        return sum;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] b = new double[(int) (a.length / alpha)];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[(int) (alpha * i)];
        }
        return b;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] a;
        a = StdAudio.read("silence.wav");
        StdAudio.play("silence.wav");
        StdAudio.play(amplify(a, 4.0));

        double[] b = new double[2646000];
        b = StdAudio.read("buzzer.wav");
        StdAudio.play("buzzer.wav");
        StdAudio.play(reverse(a));

        double[] c;
        c = StdAudio.read("chimes.wav");
        double[] c1;
        c1 = StdAudio.read("exposure.wav");
        StdAudio.play("chimes.wav");
        StdAudio.play("exposure.wav");
        StdAudio.play(merge(c, c1));

        double[] d;
        d = StdAudio.read("cow.wav");
        double[] d1;
        d1 = StdAudio.read("harp.wav");
        StdAudio.play("cow.wav");
        StdAudio.play("harp.wav");
        StdAudio.play(mix(d, d1));

        double[] e;
        e = StdAudio.read("piano.wav");
        StdAudio.play("piano.wav");
        StdAudio.play(changeSpeed(e, 0.6));
    }
}
