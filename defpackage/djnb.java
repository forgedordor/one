package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djnb {
    public static final void a(final ics icsVar, final djmn djmnVar, hml hmlVar, final int i) {
        int i2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(348394206);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djmnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djmd.d(egq.u(icsVar, 0.0f, ((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)).screenHeightDp, 1), false, djmnVar.i, null, hxe.d(1592593124, new djna(djmnVar), hmlVarC), hmlVarC, 24576, 10);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djmz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    djnb.a(icsVar2, djmnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
