package defpackage;

import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auvv implements eora {
    final /* synthetic */ Level a;

    public auvv(Level level) {
        this.a = level;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        th.getClass();
        if (th instanceof CancellationException) {
            ((ekrd) auvx.a.a(this.a).g(th).h("com/google/android/apps/messaging/shared/concurrent/FuturesKtKt$logCancellation$1", "onFailure", 252, "FuturesKt.kt")).q("Future was cancelled.");
        }
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
