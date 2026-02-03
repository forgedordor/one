package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqb extends aivg {
    public aiqb(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    protected static final enla e(int i, int i2, long j) {
        enky enkyVar = (enky) enla.a.createBuilder();
        enkyVar.copyOnWrite();
        enla enlaVar = (enla) enkyVar.instance;
        enlaVar.c = i - 1;
        enlaVar.b |= 1;
        enkyVar.copyOnWrite();
        enla enlaVar2 = (enla) enkyVar.instance;
        enlaVar2.d = i2 - 1;
        enlaVar2.b |= 2;
        enkyVar.copyOnWrite();
        enla enlaVar3 = (enla) enkyVar.instance;
        enlaVar3.b |= 4;
        enlaVar3.e = (((int) j) / 10) * 10;
        return (enla) enkyVar.build();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aipy
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                enla enlaVar = (enla) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                enlaVar.getClass();
                elivVar.d = enlaVar;
                elivVar.c = 12;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i, final long j) {
        k(new Supplier() { // from class: aiqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return aiqb.e(3, i, j);
            }
        });
    }

    public final void c(final int i, final long j) {
        k(new Supplier() { // from class: aipx
            @Override // java.util.function.Supplier
            public final Object get() {
                return aiqb.e(2, i, j);
            }
        });
    }

    public final void d(final int i, final long j) {
        k(new Supplier() { // from class: aipz
            @Override // java.util.function.Supplier
            public final Object get() {
                return aiqb.e(4, i, j);
            }
        });
    }
}
