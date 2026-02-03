package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcr {
    private final fcsu a;
    private final fcsu b;

    public cpcr(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    public final cpcq a(ejha ejhaVar) {
        Executor executor = (Executor) this.b.b();
        executor.getClass();
        return new cpcq(this.a, executor, ejhaVar);
    }
}
