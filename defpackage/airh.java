package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class airh extends aivg {
    public airh(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    public static enlk c(int i, int i2) {
        enli enliVar = (enli) enlk.a.createBuilder();
        enliVar.copyOnWrite();
        enlk enlkVar = (enlk) enliVar.instance;
        enlkVar.c = i - 1;
        enlkVar.b |= 1;
        enliVar.copyOnWrite();
        enlk enlkVar2 = (enlk) enliVar.instance;
        enlkVar2.d = 1;
        enlkVar2.b |= 2;
        enliVar.copyOnWrite();
        enlk enlkVar3 = (enlk) enliVar.instance;
        enlkVar3.e = airi.a(i2) - 1;
        enlkVar3.b |= 4;
        return (enlk) enliVar.build();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aird
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                enlk enlkVar = (enlk) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                enlkVar.getClass();
                elivVar.d = enlkVar;
                elivVar.c = 11;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i) {
        k(new Supplier() { // from class: aire
            @Override // java.util.function.Supplier
            public final Object get() {
                return airh.c(4, i);
            }
        });
    }
}
