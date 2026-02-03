package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nue extends num {
    private noc a;
    private nud o;

    private static boolean d(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // defpackage.num
    protected final long a(mfr mfrVar) {
        if (!d(mfrVar.a)) {
            return -1L;
        }
        int i = (mfrVar.a[2] & 255) >> 4;
        if (i == 6) {
            mfrVar.L(4);
            mfrVar.t();
        } else if (i == 7) {
            i = 7;
            mfrVar.L(4);
            mfrVar.t();
        }
        int iA = nny.a(mfrVar, i);
        mfrVar.K(0);
        return iA;
    }

    @Override // defpackage.num
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    @Override // defpackage.num
    protected final boolean c(mfr mfrVar, long j, nuk nukVar) {
        byte[] bArr = mfrVar.a;
        noc nocVar = this.a;
        if (nocVar == null) {
            noc nocVar2 = new noc(bArr, 17);
            this.a = nocVar2;
            mat matVar = new mat(nocVar2.c(Arrays.copyOfRange(bArr, 9, mfrVar.c), null));
            matVar.a("audio/ogg");
            nukVar.a = new mau(matVar);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            nob nobVarB = nnz.b(mfrVar);
            noc nocVarE = nocVar.e(nobVarB);
            this.a = nocVarE;
            this.o = new nud(nocVarE, nobVarB);
            return true;
        }
        if (!d(bArr)) {
            return true;
        }
        nud nudVar = this.o;
        if (nudVar != null) {
            nudVar.a = j;
            nukVar.b = nudVar;
        }
        mee.f(nukVar.a);
        return false;
    }
}
