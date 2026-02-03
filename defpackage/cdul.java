package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdul implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_MDD_LIB;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new cduq(cduk.a);
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: cduj
            @Override // java.util.function.Supplier
            public final Object get() {
                return (elms) elmv.a.createBuilder();
            }
        };
    }
}
