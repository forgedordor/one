package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggx implements fdau {
    final /* synthetic */ long a;
    final /* synthetic */ hox b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ ejy d;
    final /* synthetic */ fddq e;
    final /* synthetic */ hhv f;
    final /* synthetic */ hhr g;
    final /* synthetic */ geq h;
    final /* synthetic */ djll i;

    public ggx(long j, hox hoxVar, fdjx fdjxVar, ejy ejyVar, fddq fddqVar, hhv hhvVar, djll djllVar, hhr hhrVar, geq geqVar) {
        this.a = j;
        this.b = hoxVar;
        this.c = fdjxVar;
        this.d = ejyVar;
        this.e = fddqVar;
        this.f = hhvVar;
        this.i = djllVar;
        this.g = hhrVar;
        this.h = geqVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fddq fddqVar;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        final String strB = hjw.b(R.string.m3c_date_picker_year_picker_pane_title, hmlVar);
        ico icoVar = ics.e;
        boolean zD = hmlVar.D(strB);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdap() { // from class: ggu
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    jtk.o((jto) obj4, strB);
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        ics icsVarC = jsh.c(icoVar, false, (fdap) objF);
        long j = this.a;
        final hox hoxVar = this.b;
        final fdjx fdjxVar = this.c;
        final ejy ejyVar = this.d;
        final fddq fddqVar2 = this.e;
        final hhv hhvVar = this.f;
        djll djllVar = this.i;
        hhr hhrVar = this.g;
        geq geqVar = this.h;
        ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
        int iA = hmg.a(hmlVar);
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
        hsk.b(hmlVar, ixmVarA, jbb.e);
        hsk.b(hmlVar, hxiVarN, jbb.d);
        fdat fdatVar = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
            Integer numValueOf = Integer.valueOf(iA);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar);
        }
        hsk.b(hmlVar, icsVarB, jbb.c);
        egc egcVar = ghx.a;
        ics icsVarI = efy.i(egq.g(icoVar, 335.0f), 12.0f, 0.0f, 2);
        boolean zD2 = hmlVar.D(hoxVar) | hmlVar.F(fdjxVar) | hmlVar.D(ejyVar) | hmlVar.F(fddqVar2) | hmlVar.D(hhvVar);
        Object objF2 = hmlVar.f();
        if (zD2 || objF2 == hmk.a) {
            fdap fdapVar = new fdap() { // from class: ggv
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    ghx.a(hoxVar, !ghx.f(r7));
                    fdil.d(fdjxVar, null, null, new ggw(ejyVar, iIntValue, fddqVar2, hhvVar, null), 3);
                    return fctx.a;
                }
            };
            fddqVar = fddqVar2;
            hmlVar.y(fdapVar);
            objF2 = fdapVar;
        } else {
            fddqVar = fddqVar2;
        }
        ghx.g(icsVarI, j, (fdap) objF2, djllVar, hhrVar, fddqVar, geqVar, hmlVar, 6);
        gjd.a(null, 0.0f, geqVar.x, hmlVar, 0, 3);
        hmlVar.n();
        return fctx.a;
    }
}
