package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esta extends fbos {
    private final AtomicReference a;

    public esta(fbnh fbnhVar) {
        super(fbnhVar);
        this.a = new AtomicReference(essz.b(1));
    }

    @Override // defpackage.fbot, defpackage.fbnh
    public final void a(fbng fbngVar, fbrg fbrgVar) {
        AtomicReference atomicReference;
        essz esszVar;
        int i;
        do {
            atomicReference = this.a;
            esszVar = (essz) atomicReference.get();
            i = esszVar.b;
        } while (!essy.a(atomicReference, esszVar, i == 1 ? essz.b(2) : esszVar));
        if (i == 1) {
            this.c.a(fbngVar, fbrgVar);
        } else if (i == 4) {
            fbngVar.a(esszVar.a, new fbrg());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.c.c("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.fbry, defpackage.fbnh
    public final void c(String str, Throwable th) {
        AtomicReference atomicReference;
        essz esszVar;
        int i;
        Status statusD = Status.c;
        if (str != null) {
            statusD = statusD.withDescription(str);
        }
        if (th != null) {
            statusD = statusD.d(th);
        }
        do {
            atomicReference = this.a;
            esszVar = (essz) atomicReference.get();
            i = esszVar.b;
        } while (!essy.a(atomicReference, esszVar, i == 4 ? esszVar : i == 1 ? essz.a(4, statusD) : essz.a(5, statusD)));
        this.c.c(str, th);
    }

    @Override // defpackage.fbry, defpackage.fbnh
    public final void d() {
        AtomicReference atomicReference;
        essz esszVar;
        do {
            atomicReference = this.a;
            esszVar = (essz) atomicReference.get();
            if (esszVar.b != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!essy.a(atomicReference, esszVar, essz.b(3)));
        this.c.d();
    }

    @Override // defpackage.fbry, defpackage.fbnh
    public final void e(int i) {
        int i2 = ((essz) this.a.get()).b;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        ejwl.b(i >= 0, "Number requested must be non-negative");
        this.c.e(i);
    }

    @Override // defpackage.fbot, defpackage.fbnh
    public final void f(Object obj) {
        obj.getClass();
        int i = ((essz) this.a.get()).b;
        if (i == 2) {
            this.c.f(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
