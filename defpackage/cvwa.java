package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvwa implements fdau {
    final /* synthetic */ cvvy a;

    public cvwa(cvvy cvvyVar) {
        this.a = cvvyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cvvy cvvyVar = this.a;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hmlVar.v(-491600975);
            ekqh it = cvvyVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                cvxb cvxbVar = (cvxb) it.next();
                djvp djvpVar = cvxbVar.a;
                if (djvpVar instanceof dkeg) {
                    hmlVar.v(1940354002);
                    dkeg dkegVar = (dkeg) djvpVar;
                    int i2 = cvxbVar.b;
                    long jA = cvxa.a(i2, hmlVar);
                    long jA2 = cvxa.a(i2, hmlVar);
                    String str = dkegVar.a;
                    dkef.k(dkegVar, dihi.a(joj.a(icoVar, str), str, true), null, new ije(jA2), new ije(jA), null, null, null, hmlVar, 0, 0, 1948);
                    hmlVar.o();
                } else {
                    hmlVar.v(-491584288);
                    djvo.a(djvpVar, null, hmlVar, 0, 2);
                    hmlVar.o();
                }
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
