package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzy extends fdlg implements Executor {
    public static final fdzy a = new fdzy();
    private static final fdjq b = feaf.a.i(fdzj.a("kotlinx.coroutines.io.parallelism", fddu.f(64, fdzk.a), 0, 0, 12));

    private fdzy() {
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        b.a(fcyhVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(fcyi.a, runnable);
    }

    @Override // defpackage.fdjq
    public final void h(fcyh fcyhVar, Runnable runnable) {
        b.h(fcyhVar, runnable);
    }

    @Override // defpackage.fdjq
    public final fdjq i(int i) {
        return feaf.a.i(1);
    }

    @Override // defpackage.fdjq
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.fdlg
    public final Executor g() {
        return this;
    }
}
