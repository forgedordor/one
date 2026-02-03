package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaa {
    public static final void a(final zzy zzyVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        String strB;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-463316012);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zzyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            String strC = jqu.c(R.string.compose_confirmation_title, new Object[]{zzyVar.c}, hmlVarC);
            String strB2 = jqu.b(R.string.compose_confirmation_body, hmlVarC);
            aaab aaabVar = zzyVar.d;
            hmlVarC.v(69770696);
            int iOrdinal = aaabVar.ordinal();
            if (iOrdinal == 0) {
                hmlVarC.v(-1669833681);
                strB = jqu.b(R.string.compose_confirmation_continue_with_text_button, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else if (iOrdinal == 1) {
                hmlVarC.v(-1669830576);
                strB = jqu.b(R.string.compose_confirmation_continue_with_audio_button, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                if (iOrdinal != 2) {
                    hmlVarC.v(-1669834876);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-1669827440);
                strB = jqu.b(R.string.compose_confirmation_continue_with_video_button, hmlVarC);
                ((hmw) hmlVarC).ab();
            }
            ((hmw) hmlVarC).ab();
            dktq dktqVar = new dktq(strB, zzyVar.b);
            String strB3 = jqu.b(R.string.compose_confirmation_deny_button, hmlVarC);
            fdae fdaeVar = zzyVar.a;
            diuy.a(new divf(strC, dktqVar, new dktq(strB3, fdaeVar), strB2, (List) null, (dkts) null, 0, fdaeVar, 944), icsVar, hmlVarC, i2 & 112, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zzz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zzy zzyVar2 = zzyVar;
                    int i4 = i;
                    aaaa.a(zzyVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
