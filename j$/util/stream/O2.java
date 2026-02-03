package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class O2 extends C2 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.InterfaceC0118n2, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
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

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }
}
