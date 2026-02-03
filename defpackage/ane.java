package defpackage;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ane {
    public final ScheduledFuture a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    final /* synthetic */ anf c;

    public ane(anf anfVar) {
        this.c = anfVar;
        this.a = anfVar.b.d.schedule(new Runnable() { // from class: anc
            @Override // java.lang.Runnable
            public final void run() {
                final ane aneVar = this.a;
                if (aneVar.b.getAndSet(true)) {
                    return;
                }
                anf anfVar2 = aneVar.c;
                anfVar2.b.c.execute(new Runnable() { // from class: and
                    @Override // java.lang.Runnable
                    public final void run() {
                        anm anmVar = aneVar.c.b;
                        if (anmVar.A != 9) {
                            int i = anmVar.A;
                            Objects.toString(ang.a(i));
                            anmVar.q("Camera skip reopen at state: ".concat(ang.a(i)));
                        } else {
                            anmVar.q("Camera onError timeout, reopen it.");
                            anmVar.K(8);
                            anmVar.f.b();
                        }
                    }
                });
            }
        }, 2000L, TimeUnit.MILLISECONDS);
    }
}
