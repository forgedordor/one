package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmw {
    private static final ejwm a = new ejwm() { // from class: ehmu
        @Override // defpackage.ejwm
        public final boolean a(Object obj) {
            return ((Context) obj) instanceof eyhx;
        }
    };
    private static final ejwm b = new ejwm() { // from class: ehmv
        @Override // defpackage.ejwm
        public final boolean a(Object obj) {
            return ((Context) obj) instanceof ehnz;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static ehmt a(ea eaVar) {
        return c(((ehlc) eaVar).bd(), b);
    }

    public static ehmt b(ehnu ehnuVar) {
        return c(ehnuVar.a, a);
    }

    private static ehmt c(Context context, ejwm ejwmVar) {
        for (Context baseContext = context; !ejwmVar.a(baseContext); baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (!(baseContext instanceof ContextWrapper)) {
                throw new IllegalStateException("Cannot use base context of type " + String.valueOf(context.getClass()) + " for ViewContext.");
            }
        }
        return new ehmt(context);
    }
}
