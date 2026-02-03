package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npw implements nnr {
    private nnu f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private npv o;
    private nqa p;
    private final mfr a = new mfr(4);
    private final mfr b = new mfr(9);
    private final mfr c = new mfr(11);
    private final mfr d = new mfr();
    private final npx e = new npx();
    private int g = 1;

    private final mfr h(nns nnsVar) {
        mfr mfrVar = this.d;
        if (this.l > mfrVar.b()) {
            int iB = mfrVar.b();
            mfrVar.I(new byte[Math.max(iB + iB, this.l)], 0);
        } else {
            mfrVar.K(0);
        }
        mfrVar.J(this.l);
        nnsVar.j(mfrVar.a, 0, this.l);
        return mfrVar;
    }

    private final void i() {
        if (this.n) {
            return;
        }
        this.f.w(new nop(-9223372036854775807L));
        this.n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r17, defpackage.non r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npw.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.f = nnuVar;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        mfr mfrVar = this.a;
        nnsVar.i(mfrVar.a, 0, 3);
        mfrVar.K(0);
        if (mfrVar.l() != 4607062) {
            return false;
        }
        nnsVar.i(mfrVar.a, 0, 2);
        mfrVar.K(0);
        if ((mfrVar.n() & 250) != 0) {
            return false;
        }
        nnsVar.i(mfrVar.a, 0, 4);
        mfrVar.K(0);
        int iE = mfrVar.e();
        nnsVar.k();
        nnsVar.g(iE);
        nnsVar.i(mfrVar.a, 0, 4);
        mfrVar.K(0);
        return mfrVar.e() == 0;
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
