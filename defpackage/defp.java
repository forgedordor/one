package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defp {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public final void a(defo defoVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(defoVar);
        }
    }

    public final void b(defn defnVar) {
        defo defoVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        defoVar = (defo) this.b.poll();
                        if (defoVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    defoVar.c(defnVar);
                }
            }
        }
    }
}
