package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xsf implements fdat {
    public static final xsf a = new xsf();

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            evm evmVar = xsl.a;
            ics icsVarE = efy.e(icoVar, 24.0f, 24.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
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
            xtn.k(efy.j(icoVar, 0.0f, 0.0f, 0.0f, 8.0f, 7), jqu.b(R.string.sample_incoming_message_text, hmlVar), false, hmlVar, 6, 12);
            xtn.k(null, jqu.b(R.string.sample_outgoing_message_text, hmlVar), true, hmlVar, 3072, 5);
            hmlVar.n();
        }
        return fctx.a;
    }
}
