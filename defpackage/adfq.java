package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfq implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.GOOGLE_PHOTOS_ONBOARDING_EVENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        final adfo adfoVar = adfo.a;
        return new BiConsumer() { // from class: adfp
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                adfoVar.a(obj, obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: adfn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (enda) endb.a.createBuilder();
            }
        };
    }
}
