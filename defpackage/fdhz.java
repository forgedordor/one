package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhz {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(fdhz.class, Object.class, "a");
    public volatile Object a;
    private final fdib c;

    public fdhz(Object obj, fdib fdibVar) {
        this.c = fdibVar;
        this.a = obj;
    }

    public final Object a(Object obj) {
        Object andSet = b.getAndSet(this, obj);
        if (this.c != fdia.a) {
            Objects.toString(obj);
            Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(Object obj) {
        b.lazySet(this, obj);
        if (this.c != fdia.a) {
            Objects.toString(obj);
        }
    }

    public final void c(Object obj) {
        this.a = obj;
        if (this.c != fdia.a) {
            Objects.toString(obj);
        }
    }

    public final boolean d(Object obj, Object obj2) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                z = false;
                break;
            }
        }
        if (!z || this.c == fdia.a) {
            return z;
        }
        Objects.toString(obj);
        Objects.toString(obj2);
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
