package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcij extends fbqg {
    final /* synthetic */ fcil a;
    private final fcil b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public fcij(fcil fcilVar, fcil fcilVar2) {
        this.a = fcilVar;
        this.b = fcilVar2;
    }

    @Override // defpackage.fbqg
    public final fbqc a(fbqd fbqdVar) {
        if (this.c.compareAndSet(false, true)) {
            fcil fcilVar = this.a;
            final fcil fcilVar2 = this.b;
            fcilVar.g.c().execute(new Runnable() { // from class: fcii
                @Override // java.lang.Runnable
                public final void run() {
                    fcilVar2.c();
                }
            });
        }
        return fbqc.a;
    }
}
