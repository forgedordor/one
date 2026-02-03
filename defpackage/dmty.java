package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmty implements fdau {
    public static final dmty a = new dmty();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
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
            dtfn.a(djrs.b(djrr.dG, hmlVar), null, egq.k(icoVar, 20.0f), glz.a(hmlVar).b, hmlVar, 432, 0);
            egt.a(egq.o(icoVar, 8.0f), hmlVar);
            gyj.c(jqu.b(R.string.settings_button_text, hmlVar), null, glz.a(hmlVar).b, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 130042);
            hmlVar.n();
        }
        return fctx.a;
    }
}
