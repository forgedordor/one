package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class N2 extends B2 {
    public double[] c;
    public int d;

    @Override // j$.util.stream.InterfaceC0113m2, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC0128p2 interfaceC0128p2 = this.a;
        interfaceC0128p2.k(j);
        if (this.b) {
            while (i < this.d && !interfaceC0128p2.q()) {
                interfaceC0128p2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                interfaceC0128p2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC0128p2.end();
        this.c = null;
    }

    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }
}
