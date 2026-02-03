package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpc implements fdau {
    final /* synthetic */ djpe a;
    final /* synthetic */ djrr b;

    public djpc(djpe djpeVar, djrr djrrVar) {
        this.a = djpeVar;
        this.b = djrrVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        String strB;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djpe djpeVar = this.a;
            ecj ecjVarG = ecr.g(4.0f);
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            if (djpeVar.b) {
                hmlVar.v(-1103542567);
                strB = jqu.b(R.string.expandable_list_button_collapse_action, hmlVar);
                hmlVar.o();
            } else {
                hmlVar.v(-1103539977);
                strB = jqu.b(R.string.expandable_list_button_expand_action, hmlVar);
                hmlVar.o();
            }
            ics icsVarE = dli.e(icoVar, false, strB, djpeVar.c, 13);
            djrr djrrVar = this.b;
            ixm ixmVarA = egk.a(ecjVarG, iccVar, hmlVar, 54);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarE);
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
            dthx.b(djpeVar.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131070);
            dtfn.a(djrs.b(djrrVar, hmlVar), null, null, 0L, hmlVar, 48, 12);
            hmlVar.n();
        }
        return fctx.a;
    }
}
