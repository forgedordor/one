package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijw {
    private final eijz a;

    public eijw(eijz eijzVar) {
        this.a = eijzVar;
    }

    public final eiju a(Callable callable, Executor executor) {
        return eiju.g(this.a.a(callable, executor));
    }

    public final eiju b(eooy eooyVar, Executor executor) {
        return eiju.g(this.a.b(eooyVar, executor));
    }

    public final eiju c(Runnable runnable, Executor executor) {
        return eiju.g(this.a.a.c(eiid.k(runnable), executor));
    }
}
