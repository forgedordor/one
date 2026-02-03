package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djnj {
    public static final void a(final ics icsVar, final djmp djmpVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-220114193);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(icsVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djmpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            fdae fdaeVar = djmpVar.g;
            String str = djmpVar.a;
            hmlVarC.v(-1076334582);
            hwv hwvVarD = str == null ? null : hxe.d(585575446, new djnd(str), hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(-1076319613);
            boolean z = ((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dtcp.a(fdaeVar, hxe.d(1537477943, new djnf(djmpVar), hmlVarC), icsVar, hxe.d(1923340345, new djnh(djmpVar), hmlVarC), djkx.a, hwvVarD, hxe.d(-1792833348, new djni(djmpVar), hmlVarC), null, 0L, 0.0f, 0L, 0L, 0L, new knl(!z, 3), hmlVar2, ((i2 << 6) & 896) | 1600560, 0, 8064);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djnc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    djnj.a(icsVar2, djmpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
