package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoqm implements eooy {
    final /* synthetic */ Callable a;

    public eoqm(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        return eork.i(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
