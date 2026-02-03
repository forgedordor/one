package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nno implements nox {
    private final byte[] a = new byte[4096];

    @Override // defpackage.nox
    public final /* synthetic */ int e(mah mahVar, int i, boolean z) {
        return nov.a(this, mahVar, i, z);
    }

    @Override // defpackage.nox
    public final /* synthetic */ void m(mfr mfrVar, int i) {
        nov.b(this, mfrVar, i);
    }

    @Override // defpackage.nox
    public final void n(mfr mfrVar, int i, int i2) {
        mfrVar.L(i);
    }

    @Override // defpackage.nox
    public final int w(mah mahVar, int i, boolean z) throws EOFException {
        int iA = mahVar.a(this.a, 0, Math.min(4096, i));
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.nox
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.nox
    public final void i(mau mauVar) {
    }

    @Override // defpackage.nox
    public final void o(long j, int i, int i2, int i3, now nowVar) {
    }
}
