package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhf {
    private final List a = new CopyOnWriteArrayList();
    private final ddhe b;
    private Object c;

    public ddhf(ddhe ddheVar) {
        this.b = ddheVar;
    }

    final void a(Object obj) {
        synchronized (this) {
            this.c = obj;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.a(it.next(), obj);
        }
    }

    public final void b(Object obj, ejvr ejvrVar) {
        boolean zIsEmpty;
        synchronized (this) {
            List list = this.a;
            zIsEmpty = list.isEmpty();
            list.add(obj);
        }
        if (zIsEmpty) {
            return;
        }
        synchronized (this) {
            Object obj2 = this.c;
            if (obj2 != null) {
                this.b.a(obj, obj2);
            }
        }
        degc.c(null);
    }

    public final void c(Object obj, ejvr ejvrVar) {
        synchronized (this) {
            List list = this.a;
            list.remove(obj);
            if (list.isEmpty()) {
            } else {
                degc.c(true);
            }
        }
    }
}
