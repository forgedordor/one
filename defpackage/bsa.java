package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bsa {
    final atv a;
    private final int b;
    private final ArrayDeque c;
    private final Object d = new Object();

    public bsa(int i, atv atvVar) {
        this.b = i;
        this.c = new ArrayDeque(i);
        this.a = atvVar;
    }

    public final Object a() {
        Object objRemoveLast;
        synchronized (this.d) {
            objRemoveLast = this.c.removeLast();
        }
        return objRemoveLast;
    }

    public final void b(Object obj) {
        Object objA;
        synchronized (this.d) {
            ArrayDeque arrayDeque = this.c;
            objA = arrayDeque.size() >= this.b ? a() : null;
            arrayDeque.addFirst(obj);
        }
        if (this.a == null || objA == null) {
            return;
        }
        atv.a(objA);
    }

    public final boolean c() {
        boolean zIsEmpty;
        synchronized (this.d) {
            zIsEmpty = this.c.isEmpty();
        }
        return zIsEmpty;
    }
}
