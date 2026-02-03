package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijz {
    public final eorg a;

    public eijz(eorg eorgVar) {
        this.a = eorgVar;
    }

    public final ListenableFuture a(Callable callable, Executor executor) {
        return this.a.a(eiid.l(callable), executor);
    }

    public final ListenableFuture b(eooy eooyVar, Executor executor) {
        return this.a.b(eiid.c(eooyVar), executor);
    }
}
