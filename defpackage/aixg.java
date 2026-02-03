package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aixg implements eyif {
    public static dzkd a(Optional optional) {
        final dzkc dzkcVarD = dzkd.g().d(((Boolean) ajfv.q.e()).booleanValue());
        optional.ifPresent(new Consumer() { // from class: aixd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dzkcVarD.c((dzke) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return dzkcVarD.a();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
