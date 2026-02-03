package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class aipw extends aivg {
    public aipw(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    public static emon c(int i, emop emopVar, int i2, int i3, emzs emzsVar) {
        emom emomVar = (emom) emon.a.createBuilder();
        emomVar.copyOnWrite();
        emon emonVar = (emon) emomVar.instance;
        emonVar.c = i - 1;
        emonVar.b |= 1;
        emomVar.copyOnWrite();
        emon emonVar2 = (emon) emomVar.instance;
        emopVar.getClass();
        emonVar2.d = emopVar;
        emonVar2.b |= 2;
        if (i2 >= 0) {
            emomVar.copyOnWrite();
            emon emonVar3 = (emon) emomVar.instance;
            emonVar3.b |= 4;
            emonVar3.e = i2;
        }
        if (i3 >= 0) {
            emomVar.copyOnWrite();
            emon emonVar4 = (emon) emomVar.instance;
            emonVar4.b |= 8;
            emonVar4.f = i3;
        }
        if (emzsVar != null) {
            emomVar.copyOnWrite();
            emon emonVar5 = (emon) emomVar.instance;
            emonVar5.g = emzsVar;
            emonVar5.b |= 16;
        }
        return (emon) emomVar.build();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aipt
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emon emonVar = (emon) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                emonVar.getClass();
                elivVar.d = emonVar;
                elivVar.c = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final emop emopVar, final int i) {
        k(new Supplier() { // from class: aipu
            @Override // java.util.function.Supplier
            public final Object get() {
                return aipw.c(2, emopVar, i, -1, null);
            }
        });
    }

    public final eiju d(final int i, final emop emopVar, final int i2, final emzs emzsVar) {
        return h(new Supplier() { // from class: aipv
            @Override // java.util.function.Supplier
            public final Object get() {
                return aipw.c(i, emopVar, -1, i2, emzsVar);
            }
        });
    }
}
