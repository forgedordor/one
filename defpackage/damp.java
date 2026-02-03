package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class damp implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_FEDERATED_LEARNING;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new damv(damo.a);
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: damn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (elli) ellj.a.createBuilder();
            }
        };
    }
}
