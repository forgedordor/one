package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nug {
    public final nuh a = new nuh();
    public final mfr b = new mfr(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    private final int b(int i) {
        int i2;
        int i3 = 0;
        this.e = 0;
        do {
            int i4 = this.e;
            int i5 = i + i4;
            nuh nuhVar = this.a;
            if (i5 >= nuhVar.c) {
                break;
            }
            this.e = i4 + 1;
            i2 = nuhVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(nns nnsVar) {
        mee.c(true);
        if (this.d) {
            this.d = false;
            this.b.G(0);
        }
        while (!this.d) {
            int i = this.c;
            if (i < 0) {
                nuh nuhVar = this.a;
                if (!nuhVar.c(nnsVar) || !nuhVar.b(nnsVar, true)) {
                    return false;
                }
                int iB = nuhVar.d;
                if ((nuhVar.a & 1) == 1 && this.b.c == 0) {
                    iB += b(0);
                    i = this.e;
                } else {
                    i = 0;
                }
                if (!nnv.d(nnsVar, iB)) {
                    return false;
                }
                this.c = i;
            }
            int iB2 = b(i);
            int i2 = this.c + this.e;
            if (iB2 > 0) {
                mfr mfrVar = this.b;
                mfrVar.D(mfrVar.c + iB2);
                if (!nnv.c(nnsVar, mfrVar.a, mfrVar.c, iB2)) {
                    return false;
                }
                mfrVar.J(mfrVar.c + iB2);
                this.d = this.a.f[i2 + (-1)] != 255;
            }
            if (i2 == this.a.c) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }
}
