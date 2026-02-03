package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adls implements fdau {
    final /* synthetic */ adlg a;

    public adls(adlg adlgVar) {
        this.a = adlgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            adlg adlgVar = this.a;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = adlr.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
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
            dkri dkriVar = adlgVar.c;
            edf edfVar = edf.a;
            dkqr.h(dkriVar, egq.c(icoVar, 1.0f), hmlVar, 48);
            ics icsVarD = efy.d(edfVar.a(egq.d(icoVar, 1.0f), ibw.g), 16.0f);
            ixm ixmVarA2 = edl.a(ecr.d, ibw.j, hmlVar, 54);
            int iA2 = adlr.a(hmg.b(hmlVar));
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
            String str = adlgVar.a;
            jyq jyqVar = glz.d(hmlVar).h;
            long j = ije.d;
            dthx.b(str, null, j, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jyqVar, hmlVar, 384, 3120, 55290);
            dthx.b(jqu.c(R.string.group_info, new Object[]{Integer.valueOf(adlgVar.b)}, hmlVar), null, j, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVar).k, hmlVar, 384, 3120, 55290);
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
