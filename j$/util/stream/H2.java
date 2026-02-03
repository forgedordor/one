package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class H2 extends D2 {
    public X2 c;

    @Override // j$.util.stream.InterfaceC0123o2, j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.AbstractC0108l2, j$.util.stream.InterfaceC0128p2
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC0128p2 interfaceC0128p2 = this.a;
        interfaceC0128p2.k(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (interfaceC0128p2.q()) {
                    break;
                }
                interfaceC0128p2.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                interfaceC0128p2.accept(jArr[i]);
                i++;
            }
        }
        interfaceC0128p2.end();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.X2, j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Z2] */
    @Override // j$.util.stream.AbstractC0108l2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new X2((int) j) : new Z2();
    }
}
