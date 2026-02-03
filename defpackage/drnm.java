package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnm {
    public static Object a(ListenableFuture listenableFuture, Object obj) {
        try {
            return eork.q(listenableFuture);
        } catch (IllegalStateException | ExecutionException unused) {
            return obj;
        }
    }
}
