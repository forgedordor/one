package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xti implements fdau {
    final /* synthetic */ xsn a;
    final /* synthetic */ fdap b;
    final /* synthetic */ hsf c;
    final /* synthetic */ hox d;

    public xti(xsn xsnVar, fdap fdapVar, hsf hsfVar, hox hoxVar) {
        this.a = xsnVar;
        this.b = fdapVar;
        this.c = hsfVar;
        this.d = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edp edpVar = (edp) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edpVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edpVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarB = edp.b(icoVar, 1.0f, true);
            xsn xsnVar = this.a;
            fdap fdapVar = this.b;
            hsf hsfVar = this.c;
            hox hoxVar = this.d;
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB2, jbb.c);
            egt.a(efy.d(icoVar, ehh.a(ehv.g(hmlVar), hmlVar).d()), hmlVar);
            hmlVar.v(-1382335014);
            if (((Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a)).orientation == 1) {
                xtn.e(hmlVar, 0);
            }
            hmlVar.o();
            xtn.h(xsnVar.b, xsnVar.c, xtn.a(hsfVar), xtn.b(hoxVar), fdapVar, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
