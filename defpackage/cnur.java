package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnur {
    private final cnuj a;

    public cnur(cnuk cnukVar) {
        this.a = cnukVar.a(new BiConsumer() { // from class: cnuq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqd enqdVar = (enqd) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqdVar.getClass();
                enqwVar.d = enqdVar;
                enqwVar.c = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, UUID uuid2, int i, ekgb ekgbVar) {
        enqb enqbVar = (enqb) enqd.a.createBuilder();
        evqs evqsVarA = cnru.a(uuid2);
        enqbVar.copyOnWrite();
        enqd enqdVar = (enqd) enqbVar.instance;
        enqdVar.b |= 1;
        enqdVar.c = evqsVarA;
        enqbVar.copyOnWrite();
        enqd enqdVar2 = (enqd) enqbVar.instance;
        enqdVar2.b |= 2;
        enqdVar2.d = 0L;
        enqbVar.copyOnWrite();
        enqd enqdVar3 = (enqd) enqbVar.instance;
        enqdVar3.e = i - 1;
        enqdVar3.b |= 4;
        this.a.b(uuid, ekgbVar, (enqd) enqbVar.build());
    }
}
