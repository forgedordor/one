package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnut {
    public final cnuj a;

    public cnut(cnuk cnukVar) {
        this.a = cnukVar.a(new BiConsumer() { // from class: cnus
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqr enqrVar = (enqr) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqrVar.getClass();
                enqwVar.d = enqrVar;
                enqwVar.c = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public static enqr a(enqq enqqVar, int i, boolean z, boolean z2) {
        enqn enqnVar = (enqn) enqr.a.createBuilder();
        enqnVar.copyOnWrite();
        enqr enqrVar = (enqr) enqnVar.instance;
        enqrVar.e = enqqVar.M;
        enqrVar.b |= 4;
        enqnVar.copyOnWrite();
        enqr enqrVar2 = (enqr) enqnVar.instance;
        enqrVar2.g = i - 1;
        enqrVar2.b |= 16;
        enqnVar.copyOnWrite();
        enqr enqrVar3 = (enqr) enqnVar.instance;
        enqrVar3.b |= 1;
        enqrVar3.c = z;
        enqnVar.copyOnWrite();
        enqr enqrVar4 = (enqr) enqnVar.instance;
        enqrVar4.b |= 2;
        enqrVar4.d = z2;
        return (enqr) enqnVar.build();
    }

    public static enqr d(enqq enqqVar, boolean z, boolean z2, UUID uuid) {
        enqn enqnVar = (enqn) a(enqqVar, 3, z, z2).toBuilder();
        evqs evqsVarA = cnru.a(uuid);
        enqnVar.copyOnWrite();
        enqr enqrVar = (enqr) enqnVar.instance;
        enqrVar.b |= 8;
        enqrVar.f = evqsVarA;
        return (enqr) enqnVar.build();
    }

    public final void b(enqq enqqVar, int i, boolean z, ekgb ekgbVar) {
        this.a.c(ekgbVar, a(enqqVar, i, true, z));
    }

    public final void c(enqq enqqVar, int i, ekgb ekgbVar) {
        this.a.c(ekgbVar, a(enqqVar, i, false, false));
    }
}
