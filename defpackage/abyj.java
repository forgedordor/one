package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyj extends dyay {
    final /* synthetic */ abym a;

    public abyj(abym abymVar) {
        this.a = abymVar;
    }

    @Override // defpackage.dyay
    public final void a() {
        this.a.l.ifPresent(new Consumer() { // from class: abyi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Runnable) obj).run();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
