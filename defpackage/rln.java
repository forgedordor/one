package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rln {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = rvk.a;
        a = new ArrayDeque(0);
    }

    private rln() {
    }

    static rln a(Object obj, int i, int i2) {
        rln rlnVar;
        Queue queue = a;
        synchronized (queue) {
            rlnVar = (rln) queue.poll();
        }
        if (rlnVar == null) {
            rlnVar = new rln();
        }
        rlnVar.d = obj;
        rlnVar.c = i;
        rlnVar.b = i2;
        return rlnVar;
    }

    public final void b() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rln) {
            rln rlnVar = (rln) obj;
            if (this.c == rlnVar.c && this.b == rlnVar.b && this.d.equals(rlnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
