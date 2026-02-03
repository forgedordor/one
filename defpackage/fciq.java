package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fciq extends fbqg {
    public final fbqf a;
    final /* synthetic */ fcir b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public fciq(fcir fcirVar, fbqf fbqfVar) {
        this.b = fcirVar;
        this.a = fbqfVar;
    }

    @Override // defpackage.fbqg
    public final fbqc a(fbqd fbqdVar) {
        if (this.c.compareAndSet(false, true)) {
            this.b.f.c().execute(new fcip(this));
        }
        return fbqc.a;
    }
}
