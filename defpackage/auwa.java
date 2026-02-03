package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class auwa {
    private static final cczi a = cdag.h(cdag.b, "executor_callbacks_always_crash", false);

    @Deprecated
    public static void a(Runnable runnable, Executor executor) {
        if (!auwd.a() && !((Boolean) a.e()).booleanValue()) {
            executor.execute(eiid.k(runnable));
            return;
        }
        eijx.f(runnable, executor).k(new auve(new Function() { // from class: auvd
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
        }, new RuntimeException()), eoqg.a);
    }
}
