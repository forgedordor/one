package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anpg implements anpj, cqto {
    public final Object a = new Object();
    public final AtomicReference b = new AtomicReference(Optional.empty());
    public final cqtq c;
    public final eosc d;
    public final anpj e;
    private cquc f;

    public anpg(cqtp cqtpVar, eosc eoscVar, anpj anpjVar) {
        this.c = cqtpVar.a(this);
        this.d = eoscVar;
        this.e = anpjVar;
        ejwl.b(!(anpjVar instanceof anpg), "The underlying ObservableSupplier is already a LiveCache!");
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.c.a(new cqtk() { // from class: anpd
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "LiveCache::register", "LiveCache::callback", "LiveCache::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        Optional map = ((Optional) this.b.get()).map(new Function() { // from class: anpe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return eiju.g(((egpe) obj).c());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final anpj anpjVar = this.e;
        anpjVar.getClass();
        return (eiju) map.orElseGet(new Supplier() { // from class: anpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return anpjVar.b();
            }
        });
    }

    @Override // defpackage.anpj
    public final Object c() {
        Optional optional = (Optional) this.b.get();
        if (optional.isPresent() && ((egpe) optional.get()).e()) {
            try {
                return eork.q(((egpe) optional.get()).c());
            } catch (ExecutionException unused) {
            }
        }
        return this.e.c();
    }

    @Override // defpackage.cqto
    public final void fJ() {
        boolean z;
        synchronized (this.a) {
            anpj anpjVar = this.e;
            this.f = anpjVar.a(new anpi() { // from class: anpa
                @Override // defpackage.anpi
                public final eiju a() {
                    anpg anpgVar = this.a;
                    synchronized (anpgVar.a) {
                        AtomicReference atomicReference = anpgVar.b;
                        if (((Optional) atomicReference.get()).isEmpty()) {
                            return eijx.e(null);
                        }
                        anpj anpjVar2 = anpgVar.e;
                        anpjVar2.getClass();
                        atomicReference.set(Optional.of(new egpe(new anpb(anpjVar2), anpgVar.d)));
                        anpgVar.c.c(new Supplier() { // from class: anpc
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return null;
                            }
                        }, "changeValue");
                        return eijx.e(null);
                    }
                }
            });
            AtomicReference atomicReference = this.b;
            Optional optionalEmpty = Optional.empty();
            anpjVar.getClass();
            Optional optionalOf = Optional.of(new egpe(new anpb(anpjVar), this.d));
            while (true) {
                if (atomicReference.compareAndSet(optionalEmpty, optionalOf)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != optionalEmpty) {
                    z = false;
                    break;
                }
            }
            ejwl.m(z, "Unexpected initializing future found!");
        }
    }

    @Override // defpackage.cqto
    public final void fK() {
        synchronized (this.a) {
            ejwl.m(((Optional) this.b.getAndSet(Optional.empty())).isPresent(), "Unexpectedly missing initializing future!");
        }
        cquc cqucVar = this.f;
        cqucVar.getClass();
        cqucVar.a();
        this.f = null;
    }
}
