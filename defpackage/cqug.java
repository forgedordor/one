package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqug implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_TRANSCODING;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: cquf
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                emki emkiVar = (emki) ((emke) obj2).build();
                ellh ellhVar2 = ellh.a;
                emkiVar.getClass();
                ellhVar.r = emkiVar;
                ellhVar.b |= 512;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: cque
            @Override // java.util.function.Supplier
            public final Object get() {
                return (emke) emki.a.createBuilder();
            }
        };
    }
}
