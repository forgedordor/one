package defpackage;

import com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spa extends IMagicRewriteResultCallback.Stub {
    final /* synthetic */ sno a;

    public spa(sno snoVar) {
        this.a = snoVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
    public final void onMagicRewriteInferenceFailure(int i) {
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
    public final void onMagicRewriteInferenceSuccess(siw siwVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVar = siwVar.a;
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            sju sjuVar = (sju) ekgbVar.get(i2);
            String str = sjuVar.a;
            int i3 = sjuVar.b;
            int i4 = spb.h;
            ekfwVar.h(new sow(str, i3, sjuVar.d));
        }
        ekgb ekgbVarG = ekfwVar.g();
        this.a.b(new sou(ekgb.n(ekgbVarG), siwVar.b));
    }
}
