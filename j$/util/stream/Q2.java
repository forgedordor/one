package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class Q2 extends E2 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        InterfaceC0128p2 interfaceC0128p2 = (InterfaceC0128p2) this.a;
        interfaceC0128p2.k(this.e);
        if (this.c) {
            while (i < this.e && !interfaceC0128p2.q()) {
                interfaceC0128p2.accept((InterfaceC0128p2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                interfaceC0128p2.accept((InterfaceC0128p2) this.d[i]);
                i++;
            }
        }
        interfaceC0128p2.end();
        this.d = null;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }
}
