package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiem extends aivg {
    public aiem(fcsu fcsuVar, aieq aieqVar, Executor executor) {
        super(fcsuVar, aieqVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiel
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enhj enhjVar = (enhj) obj;
                enhi enhiVar = (enhi) obj2;
                enhjVar.copyOnWrite();
                enhk enhkVar = (enhk) enhjVar.instance;
                enhk enhkVar2 = enhk.a;
                enhiVar.getClass();
                enhkVar.c = enhiVar;
                enhkVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
