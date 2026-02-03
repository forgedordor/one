package defpackage;

import com.google.android.apps.aicore.aidl.ISmartReplyResultCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spm extends ISmartReplyResultCallback.Stub {
    final /* synthetic */ sno a;

    public spm(sno snoVar) {
        this.a = snoVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
    public final void onSmartReplyInferenceFailure(int i) {
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
    public final void onSmartReplyInferenceSuccess(ski skiVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVar = skiVar.a;
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ske skeVar = (ske) ekgbVar.get(i2);
            ekfwVar.h(new spi(skeVar.a, skeVar.c, skeVar.b));
        }
        this.a.b(spl.c(ekfwVar.g(), skiVar.b));
    }
}
