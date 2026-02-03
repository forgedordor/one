package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqh extends aiqf {
    public aiqh(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiqg
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emrv emrvVar = (emrv) obj2;
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                emrvVar.getClass();
                elivVar.d = emrvVar;
                elivVar.c = 4;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aiqf
    protected final /* bridge */ /* synthetic */ evuh b(emrt emrtVar) {
        emru emruVar = (emru) emrv.a.createBuilder();
        emruVar.copyOnWrite();
        emrv emrvVar = (emrv) emruVar.instance;
        emrtVar.getClass();
        emrvVar.c = emrtVar;
        emrvVar.b |= 1;
        return (emrv) emruVar.build();
    }
}
