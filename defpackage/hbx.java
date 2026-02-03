package defpackage;

import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbx implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ gqx b;
    final /* synthetic */ fdat c;

    public hbx(fdat fdatVar, gqx gqxVar, fdat fdatVar2) {
        this.a = fdatVar;
        this.b = gqxVar;
        this.c = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        fdat fdatVar;
        ics icsVarA;
        ics icsVarJ;
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            jyq jyqVarA = hct.a(10, hmlVar);
            hct.a(15, hmlVar);
            jyq jyqVarA2 = hct.a(2, hmlVar);
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, hce.a, 0.0f, 2);
            fdat fdatVar2 = this.a;
            gqx gqxVar = this.b;
            fdat fdatVar3 = this.c;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            fdat fdatVar4 = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar4);
            fdat fdatVar5 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar5);
            fdat fdatVar6 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar6);
            }
            fdat fdatVar7 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar7);
            hmlVar.v(177519961);
            hmlVar.o();
            if (fdatVar2 == null) {
                icsVarJ = efy.i(icoVar, 0.0f, 4.0f, 1);
                fdatVar = fdatVar2;
            } else {
                float f = hce.b;
                ics icsVarA2 = !Float.isNaN(f) ? ebw.a(iuc.a, f, 0.0f, 4) : icoVar;
                if (Float.isNaN(Float.NaN)) {
                    fdatVar = fdatVar2;
                    icsVarA = icoVar;
                } else {
                    fdatVar = fdatVar2;
                    icsVarA = ebw.a(iuc.b, 0.0f, Float.NaN, 2);
                }
                icsVarJ = efy.j(icsVarA2.a(icsVarA), 0.0f, 0.0f, 0.0f, hce.c, 7);
            }
            iby ibyVar = ibw.a;
            ixm ixmVarA2 = ecz.a(ibyVar, false);
            int iA2 = hmg.a(hmlVar);
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarJ);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar4);
            hsk.b(hmlVar, hxiVarN2, fdatVar5);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar6);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar7);
            long j = gqxVar.b;
            hpt hptVar = gea.a;
            hpt hptVar2 = gyj.a;
            hnj.b(new hpu[]{hptVar.c(new ije(j)), hptVar2.c(jyqVarA2)}, fdatVar3, hmlVar, 8);
            hmlVar.n();
            if (fdatVar == null) {
                hmlVar.v(178251189);
            } else {
                hmlVar.v(178251190);
                ics icsVarJ2 = efy.j(icoVar.a(new SizeElement(0.0f, 1 == (2 & 1) ? Float.NaN : hce.d, 0.0f, (2 & 2) != 0 ? Float.NaN : 0.0f, false, 5)), 0.0f, 0.0f, 0.0f, hce.e, 7);
                ixm ixmVarA3 = ecz.a(ibyVar, false);
                int iA3 = hmg.a(hmlVar);
                hxi hxiVarN3 = hmlVar.N();
                ics icsVarB3 = icj.b(hmlVar, icsVarJ2);
                hmlVar.M();
                hmlVar.x();
                if (hmlVar.H()) {
                    hmlVar.j(fdaeVar);
                } else {
                    hmlVar.z();
                }
                hsk.b(hmlVar, ixmVarA3, fdatVar4);
                hsk.b(hmlVar, hxiVarN3, fdatVar5);
                if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA3))) {
                    Integer numValueOf3 = Integer.valueOf(iA3);
                    hmlVar.y(numValueOf3);
                    hmlVar.h(numValueOf3, fdatVar6);
                }
                hsk.b(hmlVar, icsVarB3, fdatVar7);
                hnj.b(new hpu[]{hptVar.c(new ije(gqxVar.d)), hptVar2.c(jyqVarA)}, fdatVar, hmlVar, 8);
                hmlVar.n();
            }
            hmlVar.o();
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
