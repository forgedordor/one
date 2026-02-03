package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebgz {
    public final fgwr a;

    public ebgz() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    public ebgz(Optional optional, Optional optional2, Optional optional3) {
        final fgwr fgwrVar = new fgwr(null);
        this.a = fgwrVar;
        optional2.ifPresent(new Consumer() { // from class: ebgw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fgwrVar.c = ((Integer) obj).intValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional3.ifPresent(new Consumer() { // from class: ebgx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fgwrVar.b = ((Integer) obj).intValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional.ifPresent(new Consumer() { // from class: ebgy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fgwrVar.a.a = ((Integer) obj).intValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
