package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class rih {
    private final Queue a;

    public rih() {
        char[] cArr = rvk.a;
        this.a = new ArrayDeque(20);
    }

    public abstract rit a();

    final rit b() {
        rit ritVar = (rit) this.a.poll();
        return ritVar == null ? a() : ritVar;
    }

    public final void c(rit ritVar) {
        Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(ritVar);
        }
    }
}
