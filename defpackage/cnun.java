package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnun implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.FORWARD_TELEPHONY_SYNC;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: cnul
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                enqw enqwVar = (enqw) ((enpu) obj2).build();
                ellh ellhVar2 = ellh.a;
                enqwVar.getClass();
                ellhVar.aH = enqwVar;
                ellhVar.e |= 1024;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: cnum
            @Override // java.util.function.Supplier
            public final Object get() {
                return (enpu) enqw.a.createBuilder();
            }
        };
    }
}
