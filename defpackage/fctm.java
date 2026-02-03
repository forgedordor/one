package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fctm implements Serializable, fctc {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(fctm.class, Object.class, "c");
    private volatile fdae b;
    private volatile Object c = fctu.a;

    public fctm(fdae fdaeVar) {
        this.b = fdaeVar;
    }

    private final Object writeReplace() {
        return new fcsz(a());
    }

    @Override // defpackage.fctc
    public final Object a() {
        Object obj = this.c;
        fctu fctuVar = fctu.a;
        if (obj != fctuVar) {
            return obj;
        }
        fdae fdaeVar = this.b;
        if (fdaeVar != null) {
            Object objInvoke = fdaeVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, fctuVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != fctuVar) {
                }
            }
            this.b = null;
            return objInvoke;
        }
        return this.c;
    }

    @Override // defpackage.fctc
    public final boolean b() {
        return this.c != fctu.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
