package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auvh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback");

    public static eiju a(eiju eijuVar) {
        final RuntimeException runtimeException = new RuntimeException();
        return eijuVar.f(Throwable.class, new eooz() { // from class: auvb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                auvh.g(th, runtimeException, new auva());
                return eijx.d(th);
            }
        }, eoqg.a);
    }

    public static eora b() {
        return new auve(new Function() { // from class: auvc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new RuntimeException((Throwable) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new RuntimeException());
    }

    public static eora c(Consumer consumer) {
        return new auvg(consumer, new auva(), new RuntimeException());
    }

    public static void d(Throwable th) {
        j(th, null, new auva());
    }

    public static void e(ListenableFuture listenableFuture) {
        eika.l(listenableFuture, auvf.a, eoqg.a);
    }

    public static void f(ListenableFuture listenableFuture, String str) {
        eika.l(listenableFuture, new auvf(str), eoqg.a);
    }

    public static void g(Throwable th, RuntimeException runtimeException, Function function) {
        if (!(th instanceof CancellationException)) {
            j(th, runtimeException, function);
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback", "onFailure", (char) 278, "CrashOnUnexpectedExceptionFutureCallback.java")).q("future failed due to CancellationException");
    }

    public static void h(ListenableFuture listenableFuture) {
        eika.l(listenableFuture, b(), eoqg.a);
    }

    public static void i(ListenableFuture listenableFuture, Consumer consumer, Executor executor) {
        eika.l(listenableFuture, c(consumer), executor);
    }

    private static void j(Throwable th, RuntimeException runtimeException, Function function) {
        final RuntimeException runtimeException2 = (RuntimeException) function.apply(th);
        if (runtimeException != null) {
            runtimeException2.setStackTrace(runtimeException.getStackTrace());
        }
        if (eotp.a("bugle.enable_log_before_crash_on_unexpected_exception", "bugle")) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(runtimeException2)).h("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback", "crashNow", (char) 172, "CrashOnUnexpectedExceptionFutureCallback.java")).q("Fatal error, crashing now");
        }
        ecem.a().post(new Runnable() { // from class: auuy
            @Override // java.lang.Runnable
            public final void run() {
                throw runtimeException2;
            }
        });
    }
}
