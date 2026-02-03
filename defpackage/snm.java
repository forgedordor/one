package defpackage;

import com.google.android.apps.aicore.aidl.ITokenizationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snm extends ITokenizationCallback.Stub {
    final /* synthetic */ kog a;

    public snm(kog kogVar) {
        this.a = kogVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
    public final void onTokenizationFailure(int i) {
        this.a.c(new smo(5, i, "Tokenization failed.", null));
    }

    @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
    public final void onTokenizationInfoSuccess(sme smeVar) {
        this.a.b(new smv(smeVar.a));
    }

    @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
    public final void onTokenizationSuccess(int i) {
        this.a.c(new smo(5, 14, "GetTokenInfo should not invoke onTokenizationSuccess method.", null));
    }
}
