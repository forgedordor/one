package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eike {
    private final AtomicReference a;

    public eike(Object obj) {
        this.a = new AtomicReference(obj);
    }

    public abstract Object a(Object obj, Object obj2);

    final Object b() {
        return this.a.get();
    }

    final void c(Object obj) {
        if (obj != null) {
            while (true) {
                Object objB = b();
                AtomicReference atomicReference = this.a;
                Object objA = objB != null ? a(objB, obj) : obj;
                while (!atomicReference.compareAndSet(objB, objA)) {
                    if (atomicReference.get() != objB) {
                        break;
                    }
                }
                return;
            }
        }
    }
}
