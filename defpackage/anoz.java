package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anoz implements anpj, cqto {
    public final fdap a;
    public final fdap b;
    private final cqtq c;
    private final AtomicReference d;

    public anoz(cqtp cqtpVar, fdap fdapVar, fdap fdapVar2) {
        cqtpVar.getClass();
        this.a = fdapVar;
        this.b = fdapVar2;
        this.c = cqtpVar.a(new anoy(this));
        this.d = new AtomicReference();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.c.a(new cqtk() { // from class: anox
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "InMemoryObservableSupplier::register", "InMemoryObservableSupplier::callback", "InMemoryObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        eiju eijuVarE = eijx.e(this.d.get());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.anpj
    public final Object c() {
        return this.d.get();
    }

    public final void d(Object obj) {
        this.d.set(obj);
        this.c.c(new Supplier() { // from class: anow
            @Override // java.util.function.Supplier
            public final Object get() {
                return fctx.a;
            }
        }, "changeValue");
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fJ() {
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fK() {
    }
}
