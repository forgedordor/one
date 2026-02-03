package defpackage;

import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evr implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ ics b;

    public evr(long j, ics icsVar) {
        this.a = j;
        this.b = icsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            long j = this.a;
            if (j != 9205357640488583168L) {
                hmlVar.v(-1244014006);
                ics icsVarA = this.b.a(new SizeElement(kiw.b(j), kiw.a(j), Float.NaN, Float.NaN, false));
                ixm ixmVarA = ecz.a(ibw.b, false);
                long jB = hmg.b(hmlVar);
                long j2 = jB ^ (jB >>> 32);
                hxi hxiVarN = hmlVar.N();
                ics icsVarB = icj.b(hmlVar, icsVarA);
                fdae fdaeVar = jbb.a;
                hmlVar.M();
                hmlVar.x();
                if (hmlVar.H()) {
                    hmlVar.j(fdaeVar);
                } else {
                    hmlVar.z();
                }
                int i2 = (int) j2;
                hsk.b(hmlVar, ixmVarA, jbb.e);
                hsk.b(hmlVar, hxiVarN, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
                    Integer numValueOf = Integer.valueOf(i2);
                    hmlVar.y(numValueOf);
                    hmlVar.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVar, icsVarB, jbb.c);
                evv.a(null, hmlVar, 0, 1);
                hmlVar.n();
                hmlVar.o();
            } else {
                hmlVar.v(-1243646842);
                evv.a(this.b, hmlVar, 0, 0);
                hmlVar.o();
            }
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
