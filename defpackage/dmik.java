package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmik {
    public static final void a(final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        fdapVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(68325532);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdapVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            gjk gjkVarA = dtfh.a(ije.e, 0L, hmlVarC, 14);
            ics icsVarA = dihi.a(dkr.b(egq.k(ics.e, 70.0f), dkz.a(3.0f, ije.d), evn.a), jqu.b(R.string.popup_camera_record_button_content_description, hmlVarC), true);
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(fdjxVar) | hmlVarC.F(fdapVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdae() { // from class: dmih
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdil.d(fdjxVar, null, null, new dmij(fdapVar, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dtfk.a((fdae) objS2, icsVarA, false, null, gjkVarA, dmhz.a, hmlVarC, 1572864, 44);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmii
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    dmik.a(fdapVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
