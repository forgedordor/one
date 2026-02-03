package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiqn implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_COMPOSE;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: aiql
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                eliv elivVar = (eliv) ((eliu) obj2).build();
                ellh ellhVar2 = ellh.a;
                elivVar.getClass();
                ellhVar.D = elivVar;
                ellhVar.b |= 16777216;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: aiqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eliu) eliv.a.createBuilder();
            }
        };
    }
}
