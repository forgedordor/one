package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvd {
    private final eygg a;

    public ehvd(eygg eyggVar) {
        this.a = eyggVar;
    }

    public final void a() {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: ehvc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((egpg) obj).b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b() {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: ehvb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((egpg) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
