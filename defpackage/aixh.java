package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aixh implements eyif {
    public static dzmt a(Optional optional) {
        final dzms dzmsVarC = dzmt.h().c(true);
        optional.ifPresent(new Consumer() { // from class: aixe
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((dzmq) dzmsVarC).c = (ailg) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return dzmsVarC.d();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
