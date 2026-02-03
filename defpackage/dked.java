package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dked implements fdat {
    final /* synthetic */ dkeg a;

    public dked(dkeg dkegVar) {
        this.a = dkegVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Resources.NotFoundException {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkeg dkegVar = this.a;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVar, 48);
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
            Integer num = dkegVar.e;
            hmlVar.v(1996889937);
            if (num != null) {
                num.intValue();
                dkef.c(num.intValue(), hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.v(1996891888);
            dkdm dkdmVar = dkegVar.g;
            if (dkdmVar != null && num != null) {
                egt.a(egq.o(icoVar, 8.0f), hmlVar);
            }
            hmlVar.o();
            hmlVar.v(1996897331);
            if (dkdmVar != null) {
                dkef.e(dkdmVar, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
