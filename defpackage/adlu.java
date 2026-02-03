package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adlu implements fdau {
    final /* synthetic */ dpn a;
    final /* synthetic */ adlg b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;

    public adlu(dpn dpnVar, adlg adlgVar, boolean z, boolean z2) {
        this.a = dpnVar;
        this.b = adlgVar;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        egc egcVar = (egc) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egcVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egcVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = dkl.a(efy.c(egq.c(icoVar, 1.0f), egcVar), glz.a(hmlVar).F, ikj.a);
            dpn dpnVar = this.a;
            adlg adlgVar = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = adlt.a(hmg.b(hmlVar));
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
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            ics icsVarD = efy.d(egq.c(dpc.c(icoVar, dpnVar, false & ((14 & 8) == 0), (14 & 2) != 0, true), 1.0f), 16.0f);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA2 = adlt.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarD);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar4);
            dthx.b(jqu.b(R.string.invite_via_link_title, hmlVar), efy.j(icoVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).g, hmlVar, 48, 0, 65532);
            adlw.c(adlgVar, hmlVar, 0);
            ics icsVarD2 = efy.d(egq.d(icoVar, 1.0f), 16.0f);
            ixm ixmVarA3 = egk.a(ecr.a, ibw.n, hmlVar, 48);
            int iA3 = adlt.a(hmg.b(hmlVar));
            hxi hxiVarN3 = hmlVar.N();
            ics icsVarB3 = icj.b(hmlVar, icsVarD2);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA3, fdatVar);
            hsk.b(hmlVar, hxiVarN3, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmlVar.y(numValueOf3);
                hmlVar.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB3, fdatVar4);
            dthx.b(jqu.b(R.string.toggle_text, hmlVar), egp.a.a(icoVar, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131068);
            dthf.a(z, adlgVar.h, null, !z2, null, hmlVar, 0);
            hmlVar.n();
            hmlVar.v(-726350489);
            if (z) {
                adlw.a(adlgVar, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
