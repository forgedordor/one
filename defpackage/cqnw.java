package defpackage;

import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqnw implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public cqnw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof CancellationException) {
            ((eksl) ((eksl) eksp.c(this.a).a(Level.WARNING).g(th)).h("com/google/android/apps/messaging/shared/util/future/BugleFutures", "logCancel", 118, "BugleFutures.java")).q("task cancelled");
            return;
        }
        String str = this.a;
        ((eksl) ((eksl) eksp.c(str).a(Level.SEVERE).g(th)).h("com/google/android/apps/messaging/shared/util/future/BugleFutures", "logFailure", 105, "BugleFutures.java")).q(this.b);
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
