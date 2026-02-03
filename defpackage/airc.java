package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class airc extends aivg {
    public airc(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    protected static final enlh d(int i, long j, int i2, enle enleVar) {
        enlf enlfVar = (enlf) enlh.a.createBuilder();
        enlfVar.copyOnWrite();
        enlh enlhVar = (enlh) enlfVar.instance;
        enlhVar.c = i - 1;
        enlhVar.b |= 1;
        enlfVar.copyOnWrite();
        enlh enlhVar2 = (enlh) enlfVar.instance;
        enlhVar2.b |= 2;
        enlhVar2.d = (((int) j) / 10) * 10;
        enlfVar.copyOnWrite();
        enlh enlhVar3 = (enlh) enlfVar.instance;
        enlhVar3.e = 1;
        enlhVar3.b |= 4;
        enlfVar.copyOnWrite();
        enlh enlhVar4 = (enlh) enlfVar.instance;
        enlhVar4.f = airi.a(i2) - 1;
        enlhVar4.b |= 8;
        enlfVar.copyOnWrite();
        enlh enlhVar5 = (enlh) enlfVar.instance;
        enlhVar5.g = enleVar.d;
        enlhVar5.b |= 16;
        return (enlh) enlfVar.build();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aira
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                enlh enlhVar = (enlh) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                enlhVar.getClass();
                elivVar.d = enlhVar;
                elivVar.c = 10;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final long j, final int i, final enle enleVar) {
        k(new Supplier() { // from class: aiqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return airc.d(2, j, i, enleVar);
            }
        });
    }

    public final void c(final long j, final int i, final enle enleVar) {
        k(new Supplier() { // from class: aiqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return airc.d(3, j, i, enleVar);
            }
        });
    }
}
