package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adge extends aivg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adge(fcsu fcsuVar, adfq adfqVar, Executor executor) {
        super(fcsuVar, adfqVar, executor);
        fcsuVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        final adgc adgcVar = adgc.a;
        return new BiConsumer() { // from class: adgd
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                adgcVar.a(obj, obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
