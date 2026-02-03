package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahew {
    public static final void a(final ahes ahesVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-37431158);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ahesVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarE = efy.e(egq.d(icoVar, 1.0f), 8.0f, 4.0f);
            ecj ecjVar = ecr.e;
            ixm ixmVarA = egk.a(ecjVar, ibw.m, hmlVarC, 6);
            int iA = ahet.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            ics icsVarJ = efy.j(egq.A(icoVar), 12.0f, 4.0f, 12.0f, 0.0f, 8);
            String str = ahesVar.a;
            ics icsVarA = dihi.a(icsVarJ, jqu.c(R.string.sending_as_a11y_description, new Object[]{str}, hmlVarC), true);
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: aheu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((jto) obj).getClass();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarB2 = jsh.b(icsVarA, (fdap) objS);
            ixm ixmVarA2 = egk.a(ecjVar, ibw.n, hmlVarC, 54);
            int iA2 = ahet.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarB2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            hmlVar2 = hmlVarC;
            dthx.b(jqu.b(R.string.sending_as_prefix, hmlVarC), null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).l, hmlVar2, 0, 0, 65530);
            egt.a(egq.o(icoVar, 6.0f), hmlVar2);
            dkqr.h(new dkrk(ahesVar.b, null, 0, 0, 0.0f, null, 62), egq.h(icoVar, 24.0f), hmlVar2, 48);
            egt.a(egq.o(icoVar, 6.0f), hmlVar2);
            dthx.b(str, null, glz.a(hmlVar2).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVar2).l, hmlVar2, 0, 3120, 55290);
            hmlVar2.n();
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ahev
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ahew.a(ahesVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
