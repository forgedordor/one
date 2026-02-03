package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyg implements fdau {
    final /* synthetic */ cvyy a;

    public cvyg(cvyy cvyyVar) {
        this.a = cvyyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cvyy cvyyVar = this.a;
            icc iccVar = ibw.n;
            ecj ecjVarG = ecr.g(8.0f);
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecjVarG, iccVar, hmlVar, 54);
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
            dtfn.b(jqv.b(R.drawable.gs_group_add_vd_theme_24, hmlVar), null, null, glz.a(hmlVar).a, hmlVar, 48, 4);
            dthx.b(cvyyVar.c, null, glz.a(hmlVar).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 65530);
            hmlVar.n();
        }
        return fctx.a;
    }
}
