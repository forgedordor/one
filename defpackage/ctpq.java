package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpq {
    public static final egc a = new egd(24.0f, 24.0f, 24.0f, 24.0f);
    public static final egc b = efy.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final float c = 280.0f;
    public static final float d = 560.0f;

    public static final List a(hsf hsfVar) {
        return (List) hsfVar.a();
    }

    public static final void b(final ctpi ctpiVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1659133299);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctpiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarA = hro.a(ctpiVar.a, hmlVarC);
            if (!a(hsfVarA).isEmpty()) {
                int i4 = ((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)).orientation;
                kme.a(ctpiVar.b, null, hxe.d(612148123, new ctpp(hsfVarA), hmlVarC), hmlVarC, 384, 2);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctpj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = hpy.a(i | 1);
                    ctpq.b(ctpiVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }
}
