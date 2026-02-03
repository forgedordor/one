package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achc implements ache {
    public final fcsu a;
    private final fcsu b;

    public achc(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.a = fcsuVar2;
    }

    @Override // defpackage.ache
    public final void a() {
        ((Optional) this.b.b()).ifPresent(new Consumer() { // from class: achb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aasc aascVar = (aasc) obj;
                if (aascVar.b() && aascVar.c()) {
                    ((acgu) this.a.a.b()).a(17);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
