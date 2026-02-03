package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwz implements fdat {
    final /* synthetic */ dpn a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdat c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ int f;
    final /* synthetic */ fdau g;

    public gwz(dpn dpnVar, fdat fdatVar, fdat fdatVar2, float f, float f2, int i, fdau fdauVar) {
        this.a = dpnVar;
        this.b = fdatVar;
        this.c = fdatVar2;
        this.d = f;
        this.e = f2;
        this.f = i;
        this.g = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = hob.a(fcyi.a, hmlVar);
                hmlVar.y(objF);
            }
            fdjx fdjxVar = (fdjx) objF;
            dew dewVarB = gpg.b(1, hmlVar);
            dew dewVarB2 = gpg.b(1, hmlVar);
            dpn dpnVar = this.a;
            boolean zD = hmlVar.D(dpnVar) | hmlVar.D(fdjxVar);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == obj3) {
                objF2 = new grt(dpnVar, fdjxVar, dewVarB);
                hmlVar.y(objF2);
            }
            grt grtVar = (grt) objF2;
            Object objF3 = hmlVar.f();
            if (objF3 == obj3) {
                objF3 = new gwy(dewVarB2);
                hmlVar.y(objF3);
            }
            gwy gwyVar = (gwy) objF3;
            List listG = fcva.g(this.b, this.c, hxe.d(-2125662450, new gwu(this.g, gwyVar), hmlVar));
            ics icsVarB = iex.b(eur.a(dpc.c(egq.z(egq.d(ics.e, 1.0f), ibw.d, 2), dpnVar, false, true, false)));
            float f = this.d;
            boolean zA = hmlVar.A(f);
            float f2 = this.e;
            boolean zA2 = zA | hmlVar.A(f2);
            int i2 = this.f;
            boolean zB = zA2 | hmlVar.B(i2) | hmlVar.F(grtVar);
            Object objF4 = hmlVar.f();
            if (zB || objF4 == obj3) {
                gww gwwVar = new gww(f, f2, gwyVar, i2, grtVar);
                hmlVar.y(gwwVar);
                objF4 = gwwVar;
            }
            ixu ixuVar = (ixu) objF4;
            fdat fdatVarA = iwh.a(listG);
            boolean zD2 = hmlVar.D(ixuVar);
            Object objF5 = hmlVar.f();
            if (zD2 || objF5 == obj3) {
                objF5 = new ixv(ixuVar);
                hmlVar.y(objF5);
            }
            ixm ixmVar = (ixm) objF5;
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarB);
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
            hsk.b(hmlVar, icsVarB2, jbb.c);
            fdatVarA.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
