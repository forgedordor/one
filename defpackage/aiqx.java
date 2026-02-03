package defpackage;

import j$.util.DesugarCollections;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqx extends aivg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqx(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
        fcsuVar.getClass();
        executor.getClass();
    }

    public static /* synthetic */ void b(aiqx aiqxVar, final long j, final int i, Integer num, Iterable iterable, engg enggVar, engu enguVar, emvw emvwVar, enga engaVar, int i2) {
        final Iterable iterable2 = (i2 & 8) != 0 ? fcvo.a : iterable;
        final Integer num2 = (i2 & 4) != 0 ? null : num;
        final engg enggVar2 = (i2 & 16) != 0 ? null : enggVar;
        final engu enguVar2 = (i2 & 32) != 0 ? null : enguVar;
        final emvw emvwVar2 = (i2 & 64) != 0 ? null : emvwVar;
        final enga engaVar2 = (i2 & 128) != 0 ? null : engaVar;
        iterable2.getClass();
        aiqxVar.k(new Supplier() { // from class: aiqw
            @Override // java.util.function.Supplier
            public final Object get() {
                emzo emzoVar = (emzo) emzp.a.createBuilder();
                emzoVar.getClass();
                emzoVar.copyOnWrite();
                emzp emzpVar = (emzp) emzoVar.instance;
                emzpVar.b |= 1;
                emzpVar.c = j;
                DesugarCollections.unmodifiableList(emzpVar.d).getClass();
                emzoVar.copyOnWrite();
                emzp emzpVar2 = (emzp) emzoVar.instance;
                evtg evtgVar = emzpVar2.d;
                if (!evtgVar.c()) {
                    emzpVar2.d = evsn.mutableCopy(evtgVar);
                }
                Integer num3 = num2;
                int i3 = i;
                evpz.addAll(iterable2, emzpVar2.d);
                emzoVar.copyOnWrite();
                emzp emzpVar3 = (emzp) emzoVar.instance;
                emzpVar3.e = i3 - 1;
                emzpVar3.b |= 2;
                if (num3 != null) {
                    num3.intValue();
                    int iIntValue = num3.intValue();
                    emzoVar.copyOnWrite();
                    emzp emzpVar4 = (emzp) emzoVar.instance;
                    emzpVar4.b |= 4;
                    emzpVar4.f = iIntValue;
                }
                engg enggVar3 = enggVar2;
                if (enggVar3 != null) {
                    emzoVar.copyOnWrite();
                    emzp emzpVar5 = (emzp) emzoVar.instance;
                    emzpVar5.g = enggVar3;
                    emzpVar5.b |= 8;
                }
                engu enguVar3 = enguVar2;
                if (enguVar3 != null) {
                    emzoVar.copyOnWrite();
                    emzp emzpVar6 = (emzp) emzoVar.instance;
                    emzpVar6.h = enguVar3;
                    emzpVar6.b |= 16;
                }
                emvw emvwVar3 = emvwVar2;
                if (emvwVar3 != null) {
                    emzoVar.copyOnWrite();
                    emzp emzpVar7 = (emzp) emzoVar.instance;
                    emzpVar7.i = emvwVar3;
                    emzpVar7.b |= 32;
                }
                enga engaVar3 = engaVar2;
                if (engaVar3 != null) {
                    emzoVar.copyOnWrite();
                    emzp emzpVar8 = (emzp) emzoVar.instance;
                    emzpVar8.j = engaVar3;
                    emzpVar8.b |= 64;
                }
                evsn evsnVarBuild = emzoVar.build();
                evsnVarBuild.getClass();
                return (emzp) evsnVarBuild;
            }
        });
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiqv
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emzp emzpVar = (emzp) obj2;
                eliuVar.getClass();
                emzpVar.getClass();
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                elivVar.d = emzpVar;
                elivVar.c = 13;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
