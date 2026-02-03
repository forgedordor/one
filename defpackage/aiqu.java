package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqu extends aivg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqu(fcsu fcsuVar, aiqn aiqnVar, Executor executor, fcsu fcsuVar2) {
        super(fcsuVar, aiqnVar, executor);
        fcsuVar.getClass();
        executor.getClass();
        fcsuVar2.getClass();
    }

    public static /* synthetic */ void b(aiqu aiquVar, final long j, final int i, final int i2, Iterable iterable, engg enggVar, enga engaVar, int i3) {
        if ((i3 & 8) != 0) {
            iterable = fcvo.a;
        }
        final Iterable iterable2 = iterable;
        final engg enggVar2 = (i3 & 16) != 0 ? null : enggVar;
        final enga engaVar2 = (i3 & 64) != 0 ? null : engaVar;
        iterable2.getClass();
        aiquVar.k(new Supplier() { // from class: aiqs
            @Override // java.util.function.Supplier
            public final Object get() {
                enul enulVarA = enuk.a((emzm) emzn.a.createBuilder());
                enulVarA.c(j);
                enulVarA.e();
                enulVarA.d(iterable2);
                emzm emzmVar = enulVarA.a;
                emzmVar.copyOnWrite();
                emzn emznVar = (emzn) emzmVar.instance;
                emznVar.e = i - 1;
                emznVar.b |= 2;
                emzmVar.copyOnWrite();
                emzn emznVar2 = (emzn) emzmVar.instance;
                emznVar2.b |= 4;
                emznVar2.f = i2;
                engg enggVar3 = enggVar2;
                if (enggVar3 != null) {
                    emzmVar.copyOnWrite();
                    emzn emznVar3 = (emzn) emzmVar.instance;
                    emznVar3.g = enggVar3;
                    emznVar3.b |= 8;
                }
                enga engaVar3 = engaVar2;
                if (engaVar3 != null) {
                    emzmVar.copyOnWrite();
                    emzn emznVar4 = (emzn) emzmVar.instance;
                    emznVar4.j = engaVar3;
                    emznVar4.b |= 64;
                }
                return enulVarA.a();
            }
        });
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiqt
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emzn emznVar = (emzn) obj2;
                eliuVar.getClass();
                emznVar.getClass();
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                elivVar.d = emznVar;
                elivVar.c = 7;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
