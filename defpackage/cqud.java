package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqud implements cqto, cqtw {
    public final AtomicReference a;
    private final cqtq b;

    public cqud(cqtp cqtpVar, Object obj) {
        this.b = cqtpVar.a(this);
        this.a = new AtomicReference(obj);
    }

    public static final void h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException("Cannot set TrackedAtomicReference to null. Consider TrackedAtomicReference<Optional<T>> instead.");
        }
    }

    public final cquc a(String str, cqtk cqtkVar) {
        return this.b.a(cqtkVar, "TrackedAtomicReference Subscribe", str, "TrackedAtomicReference Unsubscribe");
    }

    public final Object d() {
        return this.a.get();
    }

    public final void e() {
        eieu eieuVarK = eiiy.k("Update TrackedAtomicReference");
        try {
            this.b.b(this.a.get(), eieuVarK);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(Object obj) {
        h(obj);
        this.a.set(obj);
        e();
    }

    public final void g(Object obj, Object obj2) {
        AtomicReference atomicReference;
        h(obj2);
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(obj, obj2)) {
                e();
                return;
            }
        } while (atomicReference.get() == obj);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fJ() {
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fK() {
    }
}
