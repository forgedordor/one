package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afxr implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.MULTI_SHARE_EVENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new afxw(afxq.a);
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: afxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return (enuw) envf.a.createBuilder();
            }
        };
    }
}
