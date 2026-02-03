package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfvh {
    public final SettableFuture a = SettableFuture.create();
    public cjjd b;

    public dfvh(cjjd cjjdVar) {
        this.b = cjjdVar;
    }

    public final void a(Throwable th) {
        this.a.setException(th);
    }

    public final void b(cjjf cjjfVar) {
        this.a.set(cjjfVar);
    }

    public final synchronized void c(Instant instant) {
        cjjc cjjcVar = (cjjc) this.b.toBuilder();
        int i = this.b.h + 1;
        cjjcVar.copyOnWrite();
        cjjd cjjdVar = (cjjd) cjjcVar.instance;
        cjjdVar.b |= 8;
        cjjdVar.h = i;
        evvp evvpVarB = evwz.b(instant);
        cjjcVar.copyOnWrite();
        cjjd cjjdVar2 = (cjjd) cjjcVar.instance;
        evvpVarB.getClass();
        cjjdVar2.g = evvpVarB;
        cjjdVar2.b |= 4;
        this.b = (cjjd) cjjcVar.build();
    }
}
