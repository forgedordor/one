package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankt implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_STAR_EVENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: anks
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                enhs enhsVar = (enhs) ((enhr) obj2).build();
                ellh ellhVar2 = ellh.a;
                enhsVar.getClass();
                ellhVar.aQ = enhsVar;
                ellhVar.e |= 4194304;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: ankr
            @Override // java.util.function.Supplier
            public final Object get() {
                return (enhr) enhs.a.createBuilder();
            }
        };
    }
}
