package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afjr implements afib {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/main/RPlusLocusProxy");
    private final fdap b;

    public afjr(fdap fdapVar) {
        this.b = fdapVar;
    }

    @Override // defpackage.afib
    public final void a(afia afiaVar) {
        String str;
        if (afiaVar instanceof afhy) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/main/RPlusLocusProxy", "onUiUpdate", 50, "Locus.kt")).q("update locus context to conversation");
            str = ((afhy) afiaVar).a;
        } else {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/main/RPlusLocusProxy", "onUiUpdate", 54, "Locus.kt")).q("update locus context to non-conversation");
            str = "NonConversationPage";
        }
        this.b.invoke(str);
    }
}
