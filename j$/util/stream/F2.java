package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class F2 extends B2 {
    public T2 c;

    @Override // j$.util.stream.InterfaceC0113m2, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC0128p2 interfaceC0128p2 = this.a;
        interfaceC0128p2.k(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (interfaceC0128p2.q()) {
                    break;
                }
                interfaceC0128p2.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                interfaceC0128p2.accept(dArr[i]);
                i++;
            }
        }
        interfaceC0128p2.end();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.T2, j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Z2] */
    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new T2((int) j) : new Z2();
    }
}
