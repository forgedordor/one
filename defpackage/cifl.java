package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cifl extends aivg {
    public cifl(fcsu fcsuVar, cifj cifjVar, Executor executor) {
        super(fcsuVar, cifjVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: cifk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ellv) obj).mergeFrom((ellv) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
