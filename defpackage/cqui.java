package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqui extends aivg {
    public cqui(fcsu fcsuVar, cqug cqugVar, Executor executor) {
        super(fcsuVar, cqugVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: cquh
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((emke) obj).mergeFrom((emke) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
