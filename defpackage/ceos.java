package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceos implements eora {
    private final eygg a;

    public ceos(eygg eyggVar) {
        this.a = eyggVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        ((Optional) this.a.b()).ifPresent(new Consumer() { // from class: ceor
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                ((ceov) obj2).b(this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((Optional) this.a.b()).ifPresent(new Consumer() { // from class: ceoq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ceov) obj).b(this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
