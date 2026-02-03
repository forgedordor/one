package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxm implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BARD_EVENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new agxw(agxl.a);
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: agxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return (emnv) emnw.a.createBuilder();
            }
        };
    }
}
