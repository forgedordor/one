package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsk implements fdav {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;
    final /* synthetic */ fdap d;

    public dmsk(List list, boolean z, float f, fdap fdapVar) {
        this.a = list;
        this.b = z;
        this.c = f;
        this.d = fdapVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5 = (eih) obj;
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != hmlVar.D(obj5) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if (hmlVar.J((i & 147) != 146, i & 1)) {
            dmsb dmsbVar = (dmsb) this.a.get(iIntValue);
            hmlVar.v(1208175194);
            boolean z = dmsbVar.c;
            ico icoVar = ics.e;
            ics icsVarD = efy.d(icoVar, 8.0f);
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
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
                Object objValueOf = Integer.valueOf(i2);
                hmlVar.y(objValueOf);
                hmlVar.h(objValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            boolean z2 = dmsbVar.e;
            ics icsVarK = egq.k(icoVar, 52.0f);
            boolean z3 = this.b;
            float f = this.c;
            hmlVar.v(-1224400529);
            boolean zE = hmlVar.E(z) | hmlVar.E(z3);
            fdap fdapVar = this.d;
            boolean zD = zE | hmlVar.D(fdapVar) | hmlVar.F(dmsbVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new dmsi(z, z3, fdapVar, dmsbVar);
                hmlVar.y(objF);
            }
            hmlVar.o();
            dmsm.b(dmsbVar, z, z3, z2, f, icsVarK, (fdae) objF, hmlVar, 196608);
            hmlVar.n();
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
