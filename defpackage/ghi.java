package defpackage;

import androidx.compose.foundation.lazy.ParentSizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghi implements fdav {
    final /* synthetic */ hhr a;
    final /* synthetic */ hhv b;
    final /* synthetic */ fdap c;
    final /* synthetic */ hhq d;
    final /* synthetic */ Long e;
    final /* synthetic */ geq f;
    final /* synthetic */ gfd g;
    final /* synthetic */ djll h;

    public ghi(hhr hhrVar, hhv hhvVar, fdap fdapVar, hhq hhqVar, Long l, gfd gfdVar, djll djllVar, geq geqVar) {
        this.a = hhrVar;
        this.b = hhvVar;
        this.c = fdapVar;
        this.d = hhqVar;
        this.e = l;
        this.g = gfdVar;
        this.h = djllVar;
        this.f = geqVar;
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
            hhr hhrVar = this.a;
            hhv hhvVarH = hhrVar.h(this.b, iIntValue);
            ParentSizeElement parentSizeElement = new ParentSizeElement(eihVar.a);
            fdap fdapVar = this.c;
            hhq hhqVar = this.d;
            Long l = this.e;
            gfd gfdVar = this.g;
            djll djllVar = this.h;
            geq geqVar = this.f;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, parentSizeElement);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            ghx.k(hhvVarH, fdapVar, hhqVar.c, l, gfdVar, djllVar, geqVar, hhrVar.a, hmlVar, 221184);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
