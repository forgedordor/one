package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admo implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_SUPER_SORT_EVENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: admm
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                enie enieVar = (enie) ((enid) obj2).build();
                ellh ellhVar2 = ellh.a;
                enieVar.getClass();
                ellhVar.az = enieVar;
                ellhVar.d |= 16777216;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: admn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (enid) enie.a.createBuilder();
            }
        };
    }
}
