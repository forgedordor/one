package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzh {
    public final nox[] a;
    private final List b;
    private final String c = "video/mp2t";
    private final mhc d = new mhc(new mhb() { // from class: nzg
        @Override // defpackage.mhb
        public final void a(long j, mfr mfrVar) {
            nnf.a(j, mfrVar, this.a.a);
        }
    });

    public nzh(List list) {
        this.b = list;
        this.a = new nox[list.size()];
    }

    public final void a() {
        this.d.b();
    }

    public final void b(long j, mfr mfrVar) {
        this.d.a(j, mfrVar);
    }

    public final void c(nnu nnuVar, nzq nzqVar) {
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
            String strB = mauVar.a;
            if (strB == null) {
                strB = nzqVar.b();
            }
            mat matVar = new mat();
            matVar.a = strB;
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

    public final void d() {
        this.d.b();
    }

    public final void e(int i) {
        this.d.c(i);
    }
}
