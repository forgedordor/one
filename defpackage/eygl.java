package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eygl {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ea eaVar) {
        eygk eygkVar;
        ea eaVar2 = eaVar;
        while (true) {
            eaVar2 = eaVar2.E;
            if (eaVar2 == 0) {
                eg egVarG = eaVar.G();
                if (egVarG instanceof eygk) {
                    eygkVar = (eygk) egVarG;
                } else {
                    if (!(egVarG.getApplication() instanceof eygk)) {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", eaVar.getClass().getCanonicalName()));
                    }
                    eygkVar = (eygk) egVarG.getApplication();
                }
            } else if (eaVar2 instanceof eygk) {
                eygkVar = (eygk) eaVar2;
                break;
            }
        }
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", eaVar.getClass().getCanonicalName(), eygkVar.getClass().getCanonicalName()));
        }
        eygj eygjVarAb = eygkVar.ab();
        eygkVar.getClass();
        eygjVarAb.getClass();
        eygjVarAb.a(eaVar);
    }
}
