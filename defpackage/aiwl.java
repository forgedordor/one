package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiwl extends aivg {
    public aiwl(fcsu fcsuVar, aiwc aiwcVar, Executor executor) {
        super(fcsuVar, aiwcVar, executor);
    }

    public static emzf b(emza emzaVar, emyn emynVar, int i, long j) {
        emze emzeVar = (emze) emzf.a.createBuilder();
        emzeVar.copyOnWrite();
        emzf emzfVar = (emzf) emzeVar.instance;
        emzaVar.getClass();
        emzfVar.c = emzaVar;
        emzfVar.b |= 1;
        emzeVar.copyOnWrite();
        emzf emzfVar2 = (emzf) emzeVar.instance;
        emynVar.getClass();
        emzfVar2.d = emynVar;
        emzfVar2.b |= 2;
        emzeVar.copyOnWrite();
        emzf emzfVar3 = (emzf) emzeVar.instance;
        emzfVar3.e = i - 1;
        emzfVar3.b |= 4;
        emzeVar.copyOnWrite();
        emzf emzfVar4 = (emzf) emzeVar.instance;
        emzfVar4.b |= 8;
        emzfVar4.f = (((int) j) / 10) * 10;
        return (emzf) emzeVar.build();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiwj
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                elna elnaVar = (elna) obj;
                emzf emzfVar = (emzf) obj2;
                elnaVar.copyOnWrite();
                elnb elnbVar = (elnb) elnaVar.instance;
                elnb elnbVar2 = elnb.a;
                emzfVar.getClass();
                elnbVar.c = emzfVar;
                elnbVar.b = 7;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
