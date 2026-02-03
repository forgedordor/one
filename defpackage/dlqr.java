package defpackage;

import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlqr implements fdav {
    final /* synthetic */ dlqu a;
    final /* synthetic */ hox b;
    final /* synthetic */ hox c;
    final /* synthetic */ hox d;

    public dlqr(dlqu dlquVar, hox hoxVar, hox hoxVar2, hox hoxVar3) {
        this.a = dlquVar;
        this.b = hoxVar;
        this.c = hoxVar2;
        this.d = hoxVar3;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        Point point = (Point) obj;
        ics icsVar = (ics) obj2;
        hml hmlVar = (hml) obj3;
        ((Number) obj4).intValue();
        icsVar.getClass();
        ixm ixmVarA = ecz.a(ibw.a, false);
        long jB = hmg.b(hmlVar);
        long j2 = jB ^ (jB >>> 32);
        hxi hxiVarN = hmlVar.N();
        ics icsVarB = icj.b(hmlVar, icsVar);
        fdae fdaeVar = jbb.a;
        hmlVar.M();
        hmlVar.x();
        if (hmlVar.H()) {
            hmlVar.j(fdaeVar);
        } else {
            hmlVar.z();
        }
        int i = (int) j2;
        hsk.b(hmlVar, ixmVarA, jbb.e);
        hsk.b(hmlVar, hxiVarN, jbb.d);
        fdat fdatVar = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
            Integer numValueOf = Integer.valueOf(i);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar);
        }
        hox hoxVar = this.b;
        hsk.b(hmlVar, icsVarB, jbb.c);
        edf edfVar = edf.a;
        ico icoVar = ics.e;
        ics icsVarB2 = edfVar.b(icoVar);
        if (((Boolean) hoxVar.a()).booleanValue()) {
            hmlVar.v(1047622168);
            j = glz.a(hmlVar).c;
            hmlVar.o();
        } else {
            hmlVar.v(1047695576);
            j = glz.a(hmlVar).v;
            hmlVar.o();
        }
        long j3 = j;
        hox hoxVar2 = this.d;
        hox hoxVar3 = this.c;
        dlqu dlquVar = this.a;
        gvk.c(icsVarB2, null, j3, 0L, 0.0f, 0.0f, null, hxe.d(626045665, new dlqq(point, hoxVar3, hoxVar2, dlquVar, hoxVar), hmlVar), hmlVar, 122);
        hmlVar.v(-1490190529);
        if (!fdbq.f(dlqs.a(hoxVar3), Uri.EMPTY)) {
            dlrc.d(edfVar, new dlre(dlquVar.d, dlquVar.c), edfVar.b(icoVar), hmlVar, 6);
        }
        hmlVar.o();
        hmlVar.n();
        return fctx.a;
    }
}
