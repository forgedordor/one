package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class auwc {
    private static final cczi a = cdag.h(cdag.b, "future_callbacks_always_crash", false);

    @Deprecated
    public static eora a(final eora eoraVar) {
        return (auwd.a() || ((Boolean) a.e()).booleanValue()) ? new auvg(new Consumer() { // from class: auwb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eoraVar.b(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Function() { // from class: auuz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new auwe((Throwable) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new RuntimeException()) : eoraVar;
    }
}
