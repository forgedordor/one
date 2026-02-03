package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albc implements ales {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/RbmSuggestionRepositoryImpl");
    private final ajlu b;

    public albc(ajlu ajluVar) {
        this.b = ajluVar;
    }

    @Override // defpackage.ales
    public final anpj a() {
        throw new UnsupportedOperationException("Screen effects not supported in RBM conversations");
    }

    @Override // defpackage.ales
    public final anpj b() {
        throw new UnsupportedOperationException("Screen effects not supported in RBM conversations");
    }

    @Override // defpackage.ales
    public final anpj c() {
        throw new UnsupportedOperationException("SuggestionData suggestions not supported when SuggestionV2 is enabled");
    }

    @Override // defpackage.ales
    public final anpj d() {
        return this.b.g();
    }

    @Override // defpackage.ales
    public final eiju e(aldp aldpVar) {
        throw new UnsupportedOperationException("Not supported when SuggestionV2 is enabled");
    }

    @Override // defpackage.ales
    public final eiju f(String str, amwf amwfVar, elny elnyVar, boolean z, boolean z2) {
        if (amwfVar == null || elnyVar == null) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/RbmSuggestionRepositoryImpl", "acceptSuggestion", 76, "RbmSuggestionRepositoryImpl.kt")).q("Accept suggestion called without text or message source. Returning early.");
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        if (!z2) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/RbmSuggestionRepositoryImpl", "acceptSuggestion", 81, "RbmSuggestionRepositoryImpl.kt")).q("Action associated with suggestion did not succeed. Returning early.");
            eiju eijuVarE2 = eijx.e(null);
            eijuVarE2.getClass();
            return eijuVarE2;
        }
        ajlu ajluVar = this.b;
        ajna ajnaVar = ajna.BEST_AVAILABLE;
        int i = ekgb.d;
        eiju eijuVarK = ajluVar.k(ajnaVar, amwfVar, ekoe.a, null, null, null, elnyVar, null, null);
        eijuVarK.getClass();
        return eijuVarK;
    }

    @Override // defpackage.ales
    public final eiju g(alff alffVar) {
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
