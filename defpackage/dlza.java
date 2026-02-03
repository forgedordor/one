package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlza implements Callbacks$StatusCallback {
    final /* synthetic */ fdis a;

    public dlza(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
    public final void onCompletion(boolean z, String str) {
        if (z) {
            this.a.w(fctx.a);
        } else {
            this.a.w(fctl.a(new IllegalStateException(str)));
        }
    }
}
