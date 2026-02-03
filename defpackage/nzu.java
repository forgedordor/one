package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nzu {
    public final nox[] a;
    private final List b;
    private final String c = "video/mp2t";
    private final mhc d;

    public nzu(List list) {
        this.b = list;
        this.a = new nox[list.size()];
        mhc mhcVar = new mhc(new mhb() { // from class: nzt
            @Override // defpackage.mhb
            public final void a(long j, mfr mfrVar) {
                nnf.b(j, mfrVar, this.a.a);
            }
        });
        this.d = mhcVar;
        mhcVar.c(3);
    }

    public final void a(long j, mfr mfrVar) {
        if (mfrVar.a() < 9) {
            return;
        }
        int iE = mfrVar.e();
        int iE2 = mfrVar.e();
        int iJ = mfrVar.j();
        if (iE == 434 && iE2 == 1195456820 && iJ == 3) {
            this.d.a(j, mfrVar);
        }
    }

    public final void b(nnu nnuVar, nzq nzqVar) {
        int i = 0;
        while (true) {
            nox[] noxVarArr = this.a;
            if (i >= noxVarArr.length) {
                return;
            }
            nzqVar.c();
            nox noxVarP = nnuVar.p(nzqVar.a(), 3);
            mau mauVar = (mau) this.b.get(i);
            String str = mauVar.o;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            mee.b(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            mat matVar = new mat();
            matVar.a = nzqVar.b();
            matVar.a(this.c);
            matVar.c(str);
            matVar.e = mauVar.e;
            matVar.d = mauVar.d;
            matVar.J = mauVar.L;
            matVar.p = mauVar.r;
            noxVarP.i(new mau(matVar));
            noxVarArr[i] = noxVarP;
            i++;
        }
    }
}
