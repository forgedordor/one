package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cifj implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_GROUP;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: cifh
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                elmc elmcVar = (elmc) ((ellv) obj2).build();
                ellh ellhVar2 = ellh.a;
                elmcVar.getClass();
                ellhVar.B = elmcVar;
                ellhVar.b |= 4194304;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: cifi
            @Override // java.util.function.Supplier
            public final Object get() {
                return (ellv) elmc.b.createBuilder();
            }
        };
    }
}
