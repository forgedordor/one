package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwz implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.MMS_METADATA_EXPERIMENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: ckwx
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                emby embyVar = (emby) ((embq) obj2).build();
                ellh ellhVar2 = ellh.a;
                embyVar.getClass();
                ellhVar.ar = embyVar;
                ellhVar.d |= 32768;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: ckwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return (embq) emby.a.createBuilder();
            }
        };
    }
}
