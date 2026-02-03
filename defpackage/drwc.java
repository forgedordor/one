package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drwc {
    public static final ekgp a;
    final Executor b;
    final boolean c;
    final AtomicBoolean d;
    final ArrayDeque e = new ArrayDeque(1);

    static {
        ekgi ekgiVar = new ekgi();
        a(ekgiVar, drlv.b);
        a(ekgiVar, drlv.a);
        a = ekgiVar.b();
    }

    public drwc(Executor executor, boolean z) {
        this.b = executor;
        this.c = z;
        this.d = drle.c(executor) ? new AtomicBoolean(false) : null;
    }

    private static void a(ekgi ekgiVar, Executor executor) {
        ekgiVar.i(executor, new drwc(executor, true));
    }
}
