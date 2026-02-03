package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufp implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.BUGLE_CONTACT_PICKER;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new ufw(ufo.a);
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: ufn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (emsz) emta.a.createBuilder();
            }
        };
    }
}
