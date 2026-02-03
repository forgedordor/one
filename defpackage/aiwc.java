package defpackage;

import com.android.vcard.VCardConfig;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiwc implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_MEDIA_VIEWER;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: aiwa
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                elnb elnbVar = (elnb) ((elna) obj2).build();
                ellh ellhVar2 = ellh.a;
                elnbVar.getClass();
                ellhVar.W = elnbVar;
                ellhVar.c |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: aiwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return (elna) elnb.a.createBuilder();
            }
        };
    }
}
