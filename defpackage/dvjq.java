package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjq {
    public static dvjz a;

    public static ListenableFuture a(final Callable callable) {
        return eork.n(new eooy() { // from class: dvjp
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eork.i(callable.call());
            }
        }, eoqg.a);
    }
}
