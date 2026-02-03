package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eorf implements Callable {
    final /* synthetic */ Runnable a;

    public eorf(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.a.run();
        return null;
    }
}
