package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhbz {
    private final dhgz a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public dhbz(dhgz dhgzVar) {
        this.a = dhgzVar;
    }

    public final long a() {
        if (dfpk.x() && this.a.x()) {
            dhja.k("Session ID counter has been reset.", new Object[0]);
            Collection.EL.stream(this.b.entrySet()).map(new Function() { // from class: dhbw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (dhby) ((Map.Entry) obj).getValue();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).forEach(new Consumer() { // from class: dhbx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((dhby) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        long jC = this.a.c();
        dhja.c("session ID %d is generated.", Long.valueOf(jC));
        return jC;
    }

    public final void b(String str, dhby dhbyVar) {
        this.b.put(str, dhbyVar);
    }
}
