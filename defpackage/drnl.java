package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnl {
    public static boolean a(Future future) {
        if (future == null || !future.isDone() || future.isCancelled()) {
            return false;
        }
        try {
            eork.q(future);
            return true;
        } catch (ExecutionException unused) {
            return false;
        }
    }
}
