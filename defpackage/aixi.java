package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aixi implements eyif {
    public static dzrl a(ajfv ajfvVar, Optional optional) {
        boolean zB = ajfvVar.b();
        final dzrk dzrkVarI = dzrl.i();
        dzrkVarI.d(zB);
        if (((Boolean) ajfv.m.e()).booleanValue()) {
            dzrkVarI.c(true);
        }
        if (((Boolean) ajfv.n.e()).booleanValue()) {
            optional.ifPresent(new Consumer() { // from class: aixf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((dzri) dzrkVarI).b = ejwi.j((dzro) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return dzrkVarI.e();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
