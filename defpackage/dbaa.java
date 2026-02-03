package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.material.productlockup.ProductLockupView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbaa {
    public static final void a(final String str, final dazq dazqVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1774946352);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dazqVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarD = egq.d(efy.j(icoVar, 40.0f, 0.0f, 40.0f, 40.0f, 2), 1.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = dazv.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            inz inzVarA = jqq.a(dazqVar.a, hmlVarC, 0);
            ics icsVarK = egq.k(icoVar, 36.0f);
            hmlVarC.v(-652971422);
            iit iitVar = dazqVar.b ? new iit(glz.a(hmlVarC).s, 5) : null;
            hmwVar.ab();
            dnc.a(inzVarA, null, icsVarK, null, null, 0.0f, iitVar, hmlVarC, 432, 56);
            egt.a(egq.o(icoVar, 24.0f), hmlVarC);
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).q, 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).k, hmlVar2, i2 & 14, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dazz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dbaa.a(str2, dazqVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final edp edpVar, final dazu dazuVar, hml hmlVar, final int i) {
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(-651586858);
        int i3 = i2 == 0 ? (true != hmlVarC.D(edpVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(dazuVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (dazuVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dazw
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dbaa.b(edpVar, null, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: dazx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        ProductLockupView productLockupView = new ProductLockupView(context);
                        productLockupView.b(context.getString(R.string.google_messages_title));
                        productLockupView.a(0);
                        return productLockupView;
                    }
                };
                hmwVar.af(objS);
            }
            fdap fdapVar = (fdap) objS;
            hmwVar.ab();
            ico icoVar = ics.e;
            kli.b(fdapVar, edp.a(efy.d(egq.d(icoVar, 1.0f), 8.0f), ibw.k), null, hmlVarC, 6, 4);
            egt.a(egq.e(icoVar, 24.0f), hmlVarC);
            dthx.b(jqu.b(R.string.welcome_new_user_title, hmlVarC), null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).b, hmlVarC, 0, 0, 65530);
            egt.a(egq.e(icoVar, 2.0f), hmlVarC);
            dthx.b(jqu.b(R.string.welcome_no_account_description, hmlVarC), egq.o(icoVar, 358.0f), glz.a(hmlVarC).q, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).g, hmlVarC, 48, 0, 65016);
            hmlVarC = hmlVarC;
            egt.a(egq.e(icoVar, 48.0f), hmlVarC);
            ics icsVarA = dkl.a(egq.d(icoVar, 1.0f), glz.a(hmlVarC).J, evn.b(74.0f));
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = dazv.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            egt.a(egq.e(icoVar, 40.0f), hmlVarC);
            hmlVarC.v(1367938805);
            for (dazr dazrVar : dazuVar.a) {
                a(jqu.b(dazrVar.a, hmlVarC), dazrVar.b, hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dazy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    int i4 = i;
                    dbaa.b(edpVar2, dazuVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
