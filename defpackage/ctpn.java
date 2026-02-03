package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpn implements fdav {
    final /* synthetic */ List a;

    public ctpn(List list) {
        this.a = list;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        eih eihVar = (eih) obj;
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != hmlVar.D(eihVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if (hmlVar.J((i & 147) != 146, i & 1)) {
            ctoz ctozVar = (ctoz) this.a.get(iIntValue);
            hmlVar.v(-1051422411);
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new ebk();
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarC = dli.c(icsVarD, (ebk) objF, fsd.a(true, 0.0f, 6), false, null, null, ctozVar.c, 28);
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i2 = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
                Integer numValueOf = Integer.valueOf(i2);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            dtdp.a(ctozVar.b, null, egq.m(icoVar, 40.0f, 40.0f), true, null, null, hmlVar, 3504, 48);
            dthx.b(ctozVar.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131070);
            hmlVar.n();
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
