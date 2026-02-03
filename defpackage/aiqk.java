package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqk extends aivg {
    public aiqk(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiqj
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emsb emsbVar = (emsb) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                emsbVar.getClass();
                elivVar.d = emsbVar;
                elivVar.c = 8;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
