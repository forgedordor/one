package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nye implements nyf {
    private final List a;
    private final nox[] c;
    private boolean d;
    private int e;
    private int f;
    private final String b = "video/mp2t";
    private long g = -9223372036854775807L;

    public nye(List list) {
        this.a = list;
        this.c = new nox[list.size()];
    }

    private final boolean f(mfr mfrVar, int i) {
        if (mfrVar.a() == 0) {
            return false;
        }
        if (mfrVar.j() != i) {
            this.d = false;
        }
        this.e--;
        return this.d;
    }

    @Override // defpackage.nyf
    public final void a(mfr mfrVar) {
        if (this.d) {
            if (this.e != 2 || f(mfrVar, 32)) {
                if (this.e != 1 || f(mfrVar, 0)) {
                    int i = mfrVar.b;
                    int iA = mfrVar.a();
                    for (nox noxVar : this.c) {
                        mfrVar.K(i);
                        noxVar.m(mfrVar, iA);
                    }
                    this.f += iA;
                }
            }
        }
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        int i = 0;
        while (true) {
            nox[] noxVarArr = this.c;
            if (i >= noxVarArr.length) {
                return;
            }
            nzo nzoVar = (nzo) this.a.get(i);
            nzqVar.c();
            nox noxVarP = nnuVar.p(nzqVar.a(), 3);
            mat matVar = new mat();
            matVar.a = nzqVar.b();
            matVar.a(this.b);
            matVar.c("application/dvbsubs");
            matVar.p = Collections.singletonList(nzoVar.b);
            matVar.d = nzoVar.a;
            noxVarP.i(new mau(matVar));
            noxVarArr[i] = noxVarP;
            i++;
        }
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
        if (this.d) {
            mee.c(this.g != -9223372036854775807L);
            for (nox noxVar : this.c) {
                noxVar.o(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.g = j;
        this.f = 0;
        this.e = 2;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.d = false;
        this.g = -9223372036854775807L;
    }
}
