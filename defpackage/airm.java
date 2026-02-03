package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class airm extends aivg {
    private final fdjx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airm(fdjx fdjxVar, fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
        fdjxVar.getClass();
        fcsuVar.getClass();
        executor.getClass();
        this.a = fdjxVar;
    }

    public static /* synthetic */ void b(airm airmVar, int i, emop emopVar, Integer num, Integer num2, int i2) {
        Integer num3 = (i2 & 4) != 0 ? null : num;
        if (num3 != null && num3.intValue() < 0) {
            throw new IllegalArgumentException(a.h(num3, "draftPosition ", " is negative"));
        }
        Integer num4 = (i2 & 8) != 0 ? null : num2;
        if (num4 != null && num4.intValue() < 0) {
            throw new IllegalArgumentException(a.h(num4, "listPosition ", " is negative"));
        }
        auvw.k(airmVar.a, null, null, new airl(airmVar, i, emopVar, num3, num4, null), 3);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: airj
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emon emonVar = (emon) obj2;
                eliuVar.getClass();
                emonVar.getClass();
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                elivVar.d = emonVar;
                elivVar.c = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
