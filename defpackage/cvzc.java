package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzc {
    public static final void a(final cvyy cvyyVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(603494105);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cvyyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtdn.a(null, null, dtdj.b(glz.a(hmlVarC).D, 0L, hmlVarC, 14), null, null, hxe.d(1053118795, new cvzb(cvyyVar), hmlVarC), hmlVarC, 196608, 27);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvza
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvzc.a(cvyyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ekgb ekgbVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1524843218);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ekgbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ekqh it = ekgbVar.iterator();
            it.getClass();
            while (it.hasNext()) {
                djvp djvpVar = (djvp) it.next();
                djvpVar.getClass();
                djvo.a(djvpVar, joj.a(ics.e, jqu.b(R.string.group_member_details, hmlVarC)), hmlVarC, 0, 0);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvyz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvzc.b(ekgbVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
