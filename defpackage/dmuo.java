package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmuo {
    public static final void a(final add addVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        hml hmlVar2;
        addVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(366745855);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(addVar) : hmlVarC.F(addVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarE = efy.e(dkl.a(efy.j(efy.i(egq.d(icoVar, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), glz.a(hmlVarC).r, evn.a), 16.0f, 12.0f);
            ixm ixmVarA = egk.a(ecr.g, ibw.n, hmlVarC, 54);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            boolean z = true;
            int i5 = i2;
            gyj.c(jqu.b(R.string.select_media_permission_request_text, hmlVarC), egp.a.a(icoVar, 1.0f, true), glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVarC, 0, 0, 131064);
            ics icsVarD = efy.d(icoVar, 12.0f);
            hmlVarC.v(5004770);
            if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !hmlVarC.F(addVar))) {
                z = false;
            }
            Object objS = hmwVar2.S();
            if (z || objS == hmk.a) {
                objS = new fdae() { // from class: dmul
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dmuo.b(addVar);
                        return fctx.a;
                    }
                };
                hmwVar = hmwVar2;
                hmwVar.af(objS);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            gyj.c(jqu.b(R.string.select_media_permission_request_button, hmlVarC), dli.e(icsVarD, false, null, (fdae) objS, 15), glz.a(hmlVarC).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, 0, 0, 131064);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmum
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dmuo.a(addVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(add addVar) {
        addVar.getClass();
        addVar.c(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }
}
