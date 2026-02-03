package defpackage;

import j$.time.Duration;
import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnuc {
    public final cnuj a;

    public cnuc(cnuk cnukVar) {
        this.a = cnukVar.a(new BiConsumer() { // from class: cnua
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enpr enprVar = (enpr) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enprVar.getClass();
                enqwVar.d = enprVar;
                enqwVar.c = 5;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, UUID uuid2, UUID uuid3, int i, Duration duration, Duration duration2, ekgb ekgbVar) {
        enpp enppVar = (enpp) enpr.a.createBuilder();
        evqs evqsVarA = cnru.a(uuid2);
        enppVar.copyOnWrite();
        enpr enprVar = (enpr) enppVar.instance;
        enprVar.b |= 1;
        enprVar.c = evqsVarA;
        evqs evqsVarA2 = cnru.a(uuid3);
        enppVar.copyOnWrite();
        enpr enprVar2 = (enpr) enppVar.instance;
        enprVar2.b |= 8;
        enprVar2.f = evqsVarA2;
        enppVar.copyOnWrite();
        enpr enprVar3 = (enpr) enppVar.instance;
        enprVar3.g = i - 1;
        enprVar3.b |= 16;
        evrj evrjVarA = evwz.a(duration);
        enppVar.copyOnWrite();
        enpr enprVar4 = (enpr) enppVar.instance;
        evrjVarA.getClass();
        enprVar4.d = evrjVarA;
        enprVar4.b |= 2;
        evrj evrjVarA2 = evwz.a(duration2);
        enppVar.copyOnWrite();
        enpr enprVar5 = (enpr) enppVar.instance;
        evrjVarA2.getClass();
        enprVar5.e = evrjVarA2;
        enprVar5.b |= 4;
        this.a.b(uuid, ekgbVar, (enpr) enppVar.build());
    }
}
