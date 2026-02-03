package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ulz implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_SELECTED_MESSAGES_ACTION;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new umb(uly.a);
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: ulx
            @Override // java.util.function.Supplier
            public final Object get() {
                return (emhm) emhn.a.createBuilder();
            }
        };
    }
}
