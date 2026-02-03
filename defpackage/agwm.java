package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agwm implements fdat {
    final /* synthetic */ agwq a;
    final /* synthetic */ Context b;

    public agwm(agwq agwqVar, Context context) {
        this.a = agwqVar;
        this.b = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            agwq agwqVar = this.a;
            Context context = this.b;
            ibx ibxVar = ibw.k;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVar, 48);
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
            fcsu fcsuVar = agwqVar.a;
            edp edpVar = edp.a;
            String strS = ((cgsa) fcsuVar.b()).s();
            String string = context.getString(R.string.gemini_eea_tos_title, strS);
            string.getClass();
            int iO = fdgn.O(string, strS, 0, false, 6);
            Integer numValueOf2 = Integer.valueOf(iO);
            Integer numValueOf3 = Integer.valueOf(iO + strS.length());
            String strI = ((cgsa) fcsuVar.b()).i();
            String string2 = context.getString(R.string.penpal_sell_page_text);
            string2.getClass();
            List listB = fcva.b(new dkeg(string2, null, null, null, null, null, null, new fdae() { // from class: agwl
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 126));
            divc divcVarA = ((agtf) agwqVar.b.b()).a();
            dksh.f(edpVar, new dksk(string, numValueOf2, numValueOf3, null, null, strI, listB, fcva.b(new dkrm(divcVarA.a, divcVarA.b)), new dksj(true)), null, 3, null, agwk.a, hmlVar, 196614, 10);
            hmlVar.n();
        }
        return fctx.a;
    }
}
