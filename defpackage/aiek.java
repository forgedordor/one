package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiek extends aivg {
    public aiek(fcsu fcsuVar, aieq aieqVar, Executor executor) {
        super(fcsuVar, aieqVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiej
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enhj enhjVar = (enhj) obj;
                enhg enhgVar = (enhg) obj2;
                enhjVar.copyOnWrite();
                enhk enhkVar = (enhk) enhjVar.instance;
                enhk enhkVar2 = enhk.a;
                enhgVar.getClass();
                enhkVar.c = enhgVar;
                enhkVar.b = 5;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
