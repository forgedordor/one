package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfn implements ngc {
    public final int a;
    final /* synthetic */ nfq b;

    public nfn(nfq nfqVar, int i) {
        this.b = nfqVar;
        this.a = i;
    }

    @Override // defpackage.ngc
    public final int a(msa msaVar, mix mixVar, int i) {
        nfq nfqVar = this.b;
        if (nfqVar.y()) {
            return -3;
        }
        int i2 = this.a;
        nfqVar.t(i2);
        ngb ngbVar = nfqVar.m[i2];
        boolean z = nfqVar.w;
        int i3 = i & 2;
        nfy nfyVar = ngbVar.b;
        int iD = ngbVar.d(msaVar, mixVar, i3 != 0, z, nfyVar);
        if (iD == -4) {
            if (!mixVar.eS()) {
                int i4 = i & 1;
                if ((i & 4) == 0) {
                    if (i4 != 0) {
                        nfw nfwVar = ngbVar.a;
                        nfw.b(nfwVar.c, mixVar, nfyVar, nfwVar.a);
                    } else {
                        nfw nfwVar2 = ngbVar.a;
                        nfwVar2.c = nfw.b(nfwVar2.c, mixVar, nfyVar, nfwVar2.a);
                        ngbVar.f++;
                    }
                } else if (i4 == 0) {
                    ngbVar.f++;
                }
            }
            iD = -4;
        }
        if (iD == -3) {
            nfqVar.u(i2);
        }
        return iD;
    }

    @Override // defpackage.ngc
    public final int b(long j) throws Throwable {
        nfq nfqVar = this.b;
        if (nfqVar.y()) {
            return 0;
        }
        int i = this.a;
        nfqVar.t(i);
        ngb ngbVar = nfqVar.m[i];
        int iB = ngbVar.b(j, nfqVar.w);
        ngbVar.p(iB);
        if (iB != 0) {
            return iB;
        }
        nfqVar.u(i);
        return 0;
    }

    @Override // defpackage.ngc
    public final void c() throws IOException {
        nfq nfqVar = this.b;
        ngb ngbVar = nfqVar.m[this.a];
        nad nadVar = ngbVar.d;
        if (nadVar == null || nadVar.a() != 1) {
            nfqVar.v();
        } else {
            nac nacVarC = ngbVar.d.c();
            mee.f(nacVarC);
            throw nacVarC;
        }
    }

    @Override // defpackage.ngc
    public final boolean d() {
        nfq nfqVar = this.b;
        if (nfqVar.y()) {
            return false;
        }
        return nfqVar.m[this.a].r(nfqVar.w);
    }
}
