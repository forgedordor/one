package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfve {
    public final diep b;
    final /* synthetic */ dfvi c;
    public final ArrayDeque a = new ArrayDeque();
    private final AtomicBoolean d = new AtomicBoolean();

    public dfve(dfvi dfviVar, diep diepVar) {
        this.c = dfviVar;
        this.b = diepVar;
    }

    public final void a() {
        this.d.set(false);
        b();
    }

    public final void b() {
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            dfvh dfvhVar = (dfvh) this.a.poll();
            if (dfvhVar == null) {
                atomicBoolean.set(false);
                return;
            }
            dfvhVar.c(this.b.f());
            cjjd cjjdVar = dfvhVar.b;
            int i = cjjdVar.c;
            if (i == 2) {
                dfvi dfviVar = this.c;
                cjim cjimVar = (cjim) ((eyig) dfviVar.c).a;
                eork.r(fcrw.a(cjimVar.a.a(cjip.d(), cjimVar.b), (cjjl) cjjdVar.d), new dfvg(this, dfvhVar), dfviVar.a);
                return;
            }
            if (i == 3) {
                dfvi dfviVar2 = this.c;
                cjim cjimVar2 = (cjim) ((eyig) dfviVar2.c).a;
                eork.r(fcrw.a(cjimVar2.a.a(cjip.c(), cjimVar2.b), (cjjh) cjjdVar.d), new dfvf(this, dfvhVar), dfviVar2.a);
            }
        }
    }

    public final boolean c(dfvh dfvhVar) {
        if (dfvhVar.b.h >= 3) {
            return false;
        }
        this.a.offerFirst(dfvhVar);
        this.d.set(false);
        dfvi dfviVar = this.c;
        dfviVar.a.schedule(new Runnable() { // from class: dfvd
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        }, 5L, TimeUnit.SECONDS);
        return true;
    }
}
