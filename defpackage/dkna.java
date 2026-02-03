package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkna implements fdau {
    final /* synthetic */ ics a;
    final /* synthetic */ dknq b;
    final /* synthetic */ float c;

    public dkna(ics icsVar, dknq dknqVar, float f) {
        this.a = icsVar;
        this.b = dknqVar;
        this.c = f;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        ics icsVarD = efy.d(dkl.a(this.a, dknc.a(), evn.a), 3.0f);
        ixm ixmVarA = ecz.a(ibw.e, false);
        long jB = hmg.b(hmlVar);
        long j = jB ^ (jB >>> 32);
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
        int i = (int) j;
        hsk.b(hmlVar, ixmVarA, jbb.e);
        hsk.b(hmlVar, hxiVarN, jbb.d);
        fdat fdatVar = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
            Integer numValueOf = Integer.valueOf(i);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar);
        }
        float f = this.c;
        dknq dknqVar = this.b;
        hsk.b(hmlVar, icsVarB, jbb.c);
        ioi ioiVarA = djrs.a(djrr.ak, hmlVar);
        ics icsVarK = egq.k(ics.e, 20.0f);
        String strB = jqu.b(R.string.progress_bar_overlay_cancel_button_content_description, hmlVar);
        long j2 = ije.d;
        dkfd.b(ioiVarA, strB, icsVarK, j2, dknqVar.b, hmlVar, 384);
        if (f == Float.POSITIVE_INFINITY) {
            hmlVar.v(-1583190698);
            dknc.c(j2, hmlVar, 0);
            hmlVar.o();
        } else {
            hmlVar.v(-1583095466);
            dknc.d(f, j2, ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.3f, ije.f(j2)), hmlVar, 0, 0);
            hmlVar.o();
        }
        hmlVar.n();
        return fctx.a;
    }
}
