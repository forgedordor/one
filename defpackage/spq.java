package defpackage;

import com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spq extends ISuggestedTextResultCallback.Stub {
    final /* synthetic */ sno a;

    public spq(sno snoVar) {
        this.a = snoVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
    public final void onSuggestedTextInferenceFailure(int i) {
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
    public final void onSuggestedTextInferenceSuccess(sku skuVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVar = skuVar.a;
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ekfwVar.h(new spi(((skq) ekgbVar.get(i2)).a, 0.0f, 0));
        }
        this.a.b(spl.c(ekfwVar.g(), skuVar.b));
    }
}
