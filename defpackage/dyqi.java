package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqi {
    private final Queue a = new ArrayDeque();
    private final dyqh b;

    public dyqi(dyqh dyqhVar) {
        this.b = dyqhVar;
    }

    public final void a() {
        ecem.c();
        while (true) {
            Queue queue = this.a;
            if (queue.isEmpty()) {
                return;
            } else {
                ((Runnable) queue.remove()).run();
            }
        }
    }

    public final void b() {
        ejwl.m(this.b.b(), "Object was not initialized");
        dyrf.a(new Runnable() { // from class: dyqg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
    }

    public final void c(Runnable runnable) {
        ecem.c();
        this.a.add(runnable);
        if (this.b.b()) {
            a();
        }
    }
}
