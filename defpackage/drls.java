package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drls {
    final drlq[] a = new drlq[64];
    private final Object b = new Object();
    private final AtomicInteger c = new AtomicInteger(0);

    final void a(drlq drlqVar) {
        int andIncrement = this.c.getAndIncrement() % 64;
        synchronized (this.b) {
            this.a[andIncrement] = drlqVar;
        }
    }
}
