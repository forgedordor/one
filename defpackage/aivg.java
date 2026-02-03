package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aivg {
    private final aivh a;
    private final Executor b;
    public final fcsu c;

    protected aivg(fcsu fcsuVar, aivh aivhVar, Executor executor) {
        this.c = fcsuVar;
        this.a = aivhVar;
        this.b = executor;
    }

    public abstract BiConsumer a();

    public final eiju h(final Supplier supplier) {
        return eijx.g(new Callable() { // from class: aivf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final aivg aivgVar = this.a;
                aivi aiviVar = (aivi) aivgVar.c.b();
                final Supplier supplier2 = supplier;
                return Boolean.valueOf(aiviVar.a(new Supplier() { // from class: aive
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return aivgVar.i((evuh) supplier2.get());
                    }
                }));
            }
        }, this.b);
    }

    public final ellg i(evuh evuhVar) {
        return j(evuhVar, Function$CC.identity());
    }

    public final ellg j(evuh evuhVar, Function function) {
        aivh aivhVar = this.a;
        evug evugVar = (evug) function.apply((evug) aivhVar.c().get());
        a().accept(evugVar, evuhVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVarA = aivhVar.a();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVarA.f11do;
        ellhVar.b |= 1;
        aivhVar.b().accept(ellgVar, evugVar);
        return ellgVar;
    }

    public final void k(final Supplier supplier) {
        ((aivi) this.c.b()).a(new Supplier() { // from class: aivd
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.i((evuh) supplier.get());
            }
        });
    }

    protected final void l(final Supplier supplier, final Function function) {
        ((aivi) this.c.b()).a(new Supplier() { // from class: aivc
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.j((evuh) supplier.get(), function);
            }
        });
    }
}
