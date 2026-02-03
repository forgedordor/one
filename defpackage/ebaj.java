package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebaj {
    private static final ekrg a = ekrg.c("com/google/android/libraries/privatetelemetry/mobalt/nontiktok/AndroidFutures");

    static /* synthetic */ void a(ListenableFuture listenableFuture, Object[] objArr) {
        try {
            eork.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e.getCause())).h("com/google/android/libraries/privatetelemetry/mobalt/nontiktok/AndroidFutures", "logOnFailure", 27, "AndroidFutures.java")).P("Mobalt: one or more reports failed to be logged to", objArr);
        }
    }
}
