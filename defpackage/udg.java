package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udg implements aivh {
    private final ellf a;

    public udg(ellf ellfVar) {
        ellfVar.getClass();
        this.a = ellfVar;
    }

    @Override // defpackage.aivh
    public final ellf a() {
        return this.a;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new udj(udf.a);
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: ude
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eljo) eljp.a.createBuilder();
            }
        };
    }
}
