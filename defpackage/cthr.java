package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthr extends aivg {
    public cthr(fcsu fcsuVar, ankt anktVar, Executor executor) {
        super(fcsuVar, anktVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: cthp
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enhr enhrVar = (enhr) obj;
                enhy enhyVar = (enhy) obj2;
                enhrVar.copyOnWrite();
                enhs enhsVar = (enhs) enhrVar.instance;
                enhs enhsVar2 = enhs.a;
                enhyVar.getClass();
                enhsVar.c = enhyVar;
                enhsVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
