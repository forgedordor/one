package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmug implements fdau {
    public static final dmug a = new dmug();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ecj ecjVarG = ecr.g(8.0f);
            icc iccVar = ibw.n;
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
            dtfn.a(djrs.b(djrr.bm, hmlVar), null, null, 0L, hmlVar, 48, 12);
            gyj.c(jqu.b(R.string.folders_button, hmlVar), null, 0L, kjm.c(14), null, null, 0L, null, kjm.c(20), 0, false, 0, 0, null, jyq.y(glz.d(hmlVar).m, glz.a(hmlVar).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hmlVar, 24576, 48, 129006);
            hmlVar.n();
        }
        return fctx.a;
    }
}
