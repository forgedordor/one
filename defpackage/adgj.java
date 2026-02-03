package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgj implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.GOOGLE_PHOTOS_OPTION_TRAY_EVENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        final adgh adghVar = adgh.a;
        return new BiConsumer() { // from class: adgi
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                adghVar.a(obj, obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: adgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return (endl) endm.a.createBuilder();
            }
        };
    }
}
