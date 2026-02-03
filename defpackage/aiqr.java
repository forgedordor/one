package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqr extends aivg {
    public aiqr(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiqq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emse emseVar = (emse) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                emseVar.getClass();
                elivVar.d = emseVar;
                elivVar.c = 14;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i) {
        k(new Supplier() { // from class: aiqp
            @Override // java.util.function.Supplier
            public final Object get() {
                emsc emscVar = (emsc) emse.a.createBuilder();
                emscVar.copyOnWrite();
                emse emseVar = (emse) emscVar.instance;
                emseVar.c = i - 1;
                emseVar.b |= 1;
                return (emse) emscVar.build();
            }
        });
    }
}
