package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gig implements fdat {
    final /* synthetic */ fze a;

    public gig(fze fzeVar) {
        this.a = fzeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final String strB = hjw.b(R.string.m3c_dialog, hmlVar);
            fze fzeVar = this.a;
            egc egcVar = fyb.a;
            ics icsVarW = egq.w(fzeVar.b, 280.0f, 0.0f, 560.0f, 0.0f, 10);
            ico icoVar = ics.e;
            boolean zD = hmlVar.D(strB);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: gif
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jtk.o((jto) obj3, strB);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarA = icsVarW.a(jsh.c(icoVar, false, (fdap) objF));
            ixm ixmVarA = ecz.a(ibw.a, true);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
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
            fzeVar.d.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
