package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nos implements nnr {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private nnu f;
    private nox g;

    public nos(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        nox noxVar = this.g;
        mee.f(noxVar);
        int iE = noxVar.e(nnsVar, 1024, true);
        if (iE == -1) {
            this.e = 2;
            this.g.o(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += iE;
        }
        return 0;
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.f = nnuVar;
        nox noxVarP = nnuVar.p(1024, 4);
        this.g = noxVarP;
        mat matVar = new mat();
        String str = this.c;
        matVar.a(str);
        matVar.c(str);
        noxVarP.i(new mau(matVar));
        this.f.r();
        this.f.w(new not());
        this.e = 1;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        int i = this.a;
        mee.c((i == -1 || this.b == -1) ? false : true);
        int i2 = this.b;
        mfr mfrVar = new mfr(i2);
        nnsVar.i(mfrVar.a, 0, i2);
        return mfrVar.n() == i;
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
