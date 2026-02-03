package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfi {
    public final qec a;
    private final qbi b;
    private final long c;
    private final Object d;
    private final Map e;

    public qfi(qbi qbiVar, qec qecVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.b = qbiVar;
        this.a = qecVar;
        this.c = millis;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public final void a(qda qdaVar) {
        Runnable runnable;
        qdaVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(qdaVar);
        }
        if (runnable != null) {
            this.b.a(runnable);
        }
    }

    public final void b(final qda qdaVar) {
        Runnable runnable = new Runnable() { // from class: qfh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c(qdaVar, 3);
            }
        };
        synchronized (this.d) {
        }
        this.b.b(this.c, runnable);
    }
}
