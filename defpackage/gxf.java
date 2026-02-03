package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxf implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdau c;

    public gxf(fdat fdatVar, fdat fdatVar2, fdau fdauVar) {
        this.a = fdatVar;
        this.b = fdatVar2;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            dew dewVarB = gpg.b(1, hmlVar);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = new gxe(dewVarB);
                hmlVar.y(objF);
            }
            gxe gxeVar = (gxe) objF;
            ics icsVarD = egq.d(ics.e, 1.0f);
            List listG = fcva.g(this.a, this.b, hxe.d(-1333331860, new gxa(this.c, gxeVar), hmlVar));
            Object objF2 = hmlVar.f();
            if (objF2 == obj3) {
                objF2 = new gxc(gxeVar);
                hmlVar.y(objF2);
            }
            ixu ixuVar = (ixu) objF2;
            fdat fdatVarA = iwh.a(listG);
            Object objF3 = hmlVar.f();
            if (objF3 == obj3) {
                objF3 = new ixv(ixuVar);
                hmlVar.y(objF3);
            }
            ixm ixmVar = (ixm) objF3;
            int iA = hmg.a(hmlVar);
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
            hsk.b(hmlVar, ixmVar, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdatVarA.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
