package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahss {
    public static final void a(final String str, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        icsVar.getClass();
        hml hmlVarC = hmlVar.c(-1092720414);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            djrv.a(Uri.parse(str), "", icsVar, null, null, null, iuz.a, null, 0.0f, null, null, null, null, null, null, null, hmlVar2, (i4 & 896) | 12582912, (i4 << 6) & 458752, 491384);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ahsr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    ahss.a(str2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
