package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiho implements ache {
    private final Set a = new HashSet();

    @Override // defpackage.ache
    public final void a() {
        if (((Boolean) clpp.a.e()).booleanValue()) {
            Collection.EL.stream(this.a).forEach(new Consumer() { // from class: aihn
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    throw null;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
