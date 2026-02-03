package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axir {
    public final Deque b = new ArrayDeque();
    public final Object c = new Object();
    public final Lock d = new ReentrantLock(true);
    public final ejxr a = ejxx.a(new ejxr() { // from class: axip
        @Override // defpackage.ejxr
        public final Object get() {
            return false;
        }
    });

    final void a(axit axitVar) {
        if (!((Boolean) this.a.get()).booleanValue()) {
            ejwl.l(axitVar == null);
            return;
        }
        axitVar.getClass();
        synchronized (this.c) {
            ejwl.l(this.b.remove(axitVar));
        }
    }
}
