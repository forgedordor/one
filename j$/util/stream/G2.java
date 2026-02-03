package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class G2 extends C2 {
    public V2 c;

    @Override // j$.util.stream.InterfaceC0118n2, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC0128p2 interfaceC0128p2 = this.a;
        interfaceC0128p2.k(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (interfaceC0128p2.q()) {
                    break;
                }
                interfaceC0128p2.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                interfaceC0128p2.accept(iArr[i]);
                i++;
            }
        }
        interfaceC0128p2.end();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.V2, j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Z2] */
    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new V2((int) j) : new Z2();
    }
}
