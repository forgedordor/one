package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nuf implements nnr {
    private nnu a;
    private num b;
    private boolean c;

    private final boolean h(nns nnsVar) {
        nuh nuhVar = new nuh();
        if (nuhVar.b(nnsVar, true) && (nuhVar.a & 2) == 2) {
            int iMin = Math.min(nuhVar.e, 8);
            mfr mfrVar = new mfr(iMin);
            nnsVar.i(mfrVar.a, 0, iMin);
            i(mfrVar);
            if (mfrVar.a() >= 5 && mfrVar.j() == 127 && mfrVar.r() == 1179402563) {
                this.b = new nue();
            } else {
                i(mfrVar);
                if (npd.d(1, mfrVar, true)) {
                    this.b = new nuo();
                } else {
                    i(mfrVar);
                    if (nuj.d(mfrVar, nuj.a)) {
                        this.b = new nuj();
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static void i(mfr mfrVar) {
        mfrVar.K(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r19, defpackage.non r20) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuf.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.a = nnuVar;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        num numVar = this.b;
        if (numVar != null) {
            nug nugVar = numVar.b;
            nugVar.a.a();
            nugVar.b.G(0);
            nugVar.c = -1;
            nugVar.d = false;
            if (j == 0) {
                numVar.b(!numVar.m);
                return;
            }
            if (numVar.i != 0) {
                numVar.f = numVar.f(j2);
                nui nuiVar = numVar.e;
                String str = mgb.a;
                nuiVar.c(numVar.f);
                numVar.i = 2;
            }
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        try {
            return h(nnsVar);
        } catch (mby unused) {
            return false;
        }
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
