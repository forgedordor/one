package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubs {
    public static final void a(final cubq cubqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1199880923);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cubqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarA = hro.a(cubqVar.a, hmlVarC);
            if (b(hsfVarA).length() > 0) {
                Toast.makeText((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b), b(hsfVarA), 0).show();
                cubqVar.b.invoke();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cubr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cubs.a(cubqVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final String b(hsf hsfVar) {
        return (String) hsfVar.a();
    }
}
