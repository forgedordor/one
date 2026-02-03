package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsh {
    public final mfr a = new mfr(8);
    public int b;

    public final long a(nns nnsVar) {
        int i;
        mfr mfrVar = this.a;
        int i2 = 0;
        nnsVar.i(mfrVar.a, 0, 1);
        int i3 = mfrVar.a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        nnsVar.i(mfrVar.a, 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (mfrVar.a[i2] & 255) + (i6 << 8);
        }
        this.b += i;
        return i6;
    }
}
