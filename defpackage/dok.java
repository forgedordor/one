package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dok {
    public final AtomicReference a = new AtomicReference(null);
    public final feav b = new feaz();

    public final Object a(dod dodVar, fdap fdapVar, fcxy fcxyVar) {
        return fdjy.a(new doh(dodVar, this, fdapVar, null), fcxyVar);
    }

    public final Object b(Object obj, dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        return fdjy.a(new doj(dodVar, this, fdatVar, obj, null), fcxyVar);
    }

    public final void c(dof dofVar) {
        while (true) {
            AtomicReference atomicReference = this.a;
            dof dofVar2 = (dof) atomicReference.get();
            if (dofVar2 != null && dofVar.a.compareTo(dofVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(dofVar2, dofVar)) {
                if (atomicReference.get() != dofVar2) {
                    break;
                }
            }
            if (dofVar2 != null) {
                dofVar2.b.t(new doe());
                return;
            }
            return;
        }
    }

    public final void d() {
        this.b.d();
    }
}
