package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcg implements kal {
    public static final kcg a = new kcg();

    private kcg() {
    }

    @Override // defpackage.kal
    public final Typeface a(Context context, kam kamVar) {
        kbe kbeVar = kamVar instanceof kbe ? (kbe) kamVar : null;
        if (kbeVar != null) {
            return kcm.b().c(kbeVar.c, kbeVar.d, kbeVar.b, context);
        }
        return null;
    }

    @Override // defpackage.kal
    public final Object b(Context context, kam kamVar, fcxy fcxyVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}
