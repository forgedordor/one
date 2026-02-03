package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbai implements fbah {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;

    static {
        eadc eadcVar = fbaf.a;
        a = eacj.e("CollectionBasisVerifierFeatures__enable_cbv_v2", false, "com.google.android.libraries.consentverifier", eadcVar);
        b = eacj.e("CollectionBasisVerifierFeatures__enable_google_signature_check", false, "com.google.android.libraries.consentverifier", eadcVar);
        c = eacj.e("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false, "com.google.android.libraries.consentverifier", eadcVar);
    }

    @Override // defpackage.fbah
    public final boolean a() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.fbah
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.fbah
    public final void c() {
        ((Boolean) c.get()).booleanValue();
    }
}
