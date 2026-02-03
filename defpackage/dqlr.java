package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqlr implements ThreadFactory {
    public final Object a = new Object();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Set c = new css();
    private int d;

    public dqlr(int i) {
        this.d = i;
    }

    public final void a(int i) {
        synchronized (this.a) {
            if (this.d == i) {
                return;
            }
            this.d = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((dqlo) it.next()).a(i);
            }
            csr csrVar = new csr((css) this.c);
            while (csrVar.hasNext()) {
                ((dqlo) csrVar.next()).a(i);
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        final dqlo dqloVar;
        synchronized (this.a) {
            dqloVar = new dqlo(this.d, runnable);
            this.b.add(dqloVar);
            dqloVar.a = new Runnable() { // from class: dqlp
                @Override // java.lang.Runnable
                public final void run() {
                    dqlr dqlrVar = this.a;
                    Object obj = dqlrVar.a;
                    dqlo dqloVar2 = dqloVar;
                    synchronized (obj) {
                        dqlrVar.b.remove(dqloVar2);
                        dqlrVar.c.add(dqloVar2);
                    }
                }
            };
            dqloVar.b = new Runnable() { // from class: dqlq
                @Override // java.lang.Runnable
                public final void run() {
                    dqlr dqlrVar = this.a;
                    Object obj = dqlrVar.a;
                    dqlo dqloVar2 = dqloVar;
                    synchronized (obj) {
                        dqlrVar.c.remove(dqloVar2);
                    }
                }
            };
        }
        return dqloVar;
    }
}
