package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvf implements dxve {
    private static final eksp a = eksp.c("GnpSdk");

    @Override // defpackage.dxve
    public final void a(Context context) {
        try {
            dzyn.f(context);
        } catch (IllegalStateException e) {
            ((eksl) ((eksl) a.o().g(e)).h("com/google/android/libraries/notifications/platform/phenotype/impl/GnpPhenotypeContextInitImpl", "initPhenotypeContext", 23, "GnpPhenotypeContextInitImpl.java")).q("PhenotypeContext.setContext was called more than once");
        }
    }
}
