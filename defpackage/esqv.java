package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqv implements fbni {
    private static final ekrg a = ekrg.c("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor");

    @Override // defpackage.fbni
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar, fbnd fbndVar) {
        final espr esprVar = (espr) fbncVar.h(espr.a);
        if (esprVar != null) {
            ((ekrd) ((ekrd) a.e()).h("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 29, "CredentialStrategyInterceptor.java")).t("Using CredentialStrategy: %s", esprVar.getClass());
            return fbnk.b(fbndVar, esrz.a(new fcsu() { // from class: esqu
                @Override // defpackage.fcsu
                public final Object b() {
                    return ekgb.r(esprVar.a());
                }
            })).a(fbrkVar, fbncVar);
        }
        ((ekrd) ((ekrd) a.e()).h("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 37, "CredentialStrategyInterceptor.java")).q("Did not set CredentialStrategy");
        return fbndVar.a(fbrkVar, fbncVar);
    }
}
