package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqd extends aiqf {
    public aiqd(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiqc
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emrk emrkVar = (emrk) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                emrkVar.getClass();
                elivVar.d = emrkVar;
                elivVar.c = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aiqf
    protected final /* bridge */ /* synthetic */ evuh b(emrt emrtVar) {
        emrj emrjVar = (emrj) emrk.a.createBuilder();
        emrjVar.copyOnWrite();
        emrk emrkVar = (emrk) emrjVar.instance;
        emrtVar.getClass();
        emrkVar.c = emrtVar;
        emrkVar.b |= 1;
        return (emrk) emrjVar.build();
    }
}
