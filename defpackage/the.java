package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class the {
    public static final void a(final tik tikVar, final ftn ftnVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        tikVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-691222728);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(tikVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ftnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String str = tikVar.a;
            str.getClass();
            final String strC = jqu.c(R.string.unblocked_toast_message, new Object[]{str}, hmlVarC);
            hmlVarC.v(-1746271574);
            boolean zD = hmlVarC.D(strC) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdae() { // from class: thb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        tik tikVar2 = tikVar;
                        String str2 = tikVar2.a;
                        str2.getClass();
                        tikVar2.d.a(str2, new thd(ftnVar, strC, null));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            float fA = jqr.a(R.dimen.blocked_participant_list_item_view_padding, hmlVarC);
            float fA2 = jqr.a(R.dimen.contact_list_row_icon_size, hmlVarC);
            ico icoVar = ics.e;
            ics icsVarE = dli.e(egq.d(efy.d(icoVar, fA), 1.0f), false, null, (fdae) objS, 15);
            ixm ixmVarA = egk.a(ecr.g, ibw.n, hmlVarC, 54);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(2067935971);
            Uri uri = tikVar.b;
            if (uri != null) {
                ahss.a(uri.toString(), egq.m(icoVar, fA2, fA2), hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            fvx.b(tikVar.c, efy.d(icoVar, fA), glz.a(hmlVarC).o, 0L, 0L, 0L, 2, false, 1, 0, null, null, hmlVar2, 0, 3120, 120824);
            fvx.b(jqu.b(R.string.tap_to_unblock_message, hmlVar2), efy.d(icoVar, fA), glz.a(hmlVar2).a, 0L, 0L, 0L, 0, false, 0, 0, null, null, hmlVar2, 0, 0, 131064);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: thc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tik tikVar2 = tikVar;
                    int i5 = i;
                    the.a(tikVar2, ftnVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
