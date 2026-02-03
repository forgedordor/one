package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noh {
    private final mfr a = new mfr(10);

    public final mbt a(nns nnsVar, nrd nrdVar) {
        mbt mbtVarC = null;
        int i = 0;
        while (true) {
            try {
                mfr mfrVar = this.a;
                nnsVar.i(mfrVar.a, 0, 10);
                mfrVar.K(0);
                if (mfrVar.l() != 4801587) {
                    break;
                }
                mfrVar.L(3);
                int i2 = mfrVar.i();
                int i3 = i2 + 10;
                if (mbtVarC == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(mfrVar.a, 0, bArr, 0, 10);
                    nnsVar.i(bArr, 10, i2);
                    mbtVarC = new nrf(nrdVar).c(bArr, i3);
                } else {
                    nnsVar.g(i2);
                }
                i += i3;
            } catch (EOFException unused) {
            }
        }
        nnsVar.k();
        nnsVar.g(i);
        return mbtVarC;
    }
}
