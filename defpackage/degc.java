package defpackage;

import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degc {
    @Deprecated
    public static defn a(Executor executor, Callable callable) {
        dclh.n(executor, "Executor must not be null");
        defv defvVar = new defv();
        executor.execute(new defy(defvVar, callable));
        return defvVar;
    }

    public static defn b(Exception exc) {
        defv defvVar = new defv();
        defvVar.u(exc);
        return defvVar;
    }

    public static defn c(Object obj) {
        defv defvVar = new defv();
        defvVar.v(obj);
        return defvVar;
    }

    public static defn d(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return c(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((defn) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        defv defvVar = new defv();
        degb degbVar = new degb(collection.size(), defvVar);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            i((defn) it2.next(), degbVar);
        }
        return defvVar;
    }

    public static defn e(defn defnVar, long j, TimeUnit timeUnit) {
        dclh.b(j > 0, "Timeout must be positive");
        dclh.n(timeUnit, "TimeUnit must not be null");
        final deeo deeoVar = new deeo();
        final defr defrVar = new defr(deeoVar);
        final ddmy ddmyVar = new ddmy(Looper.getMainLooper());
        ddmyVar.postDelayed(new Runnable() { // from class: defw
            @Override // java.lang.Runnable
            public final void run() {
                defrVar.c(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        defnVar.s(new defb() { // from class: defx
            @Override // defpackage.defb
            public final void a(defn defnVar2) {
                ddmyVar.removeCallbacksAndMessages(null);
                defr defrVar2 = defrVar;
                if (defnVar2.m()) {
                    defrVar2.d(defnVar2.i());
                } else {
                    if (((defv) defnVar2).d) {
                        deeoVar.b();
                        return;
                    }
                    Exception excH = defnVar2.h();
                    excH.getClass();
                    defrVar2.c(excH);
                }
            }
        });
        return defrVar.a;
    }

    public static Object f(defn defnVar) throws InterruptedException {
        dclh.f();
        dclh.e();
        if (defnVar.l()) {
            return h(defnVar);
        }
        defz defzVar = new defz();
        i(defnVar, defzVar);
        defzVar.a.await();
        return h(defnVar);
    }

    public static Object g(defn defnVar, long j, TimeUnit timeUnit) throws TimeoutException {
        dclh.f();
        dclh.e();
        dclh.n(timeUnit, "TimeUnit must not be null");
        if (defnVar.l()) {
            return h(defnVar);
        }
        defz defzVar = new defz();
        i(defnVar, defzVar);
        if (defzVar.a.await(j, timeUnit)) {
            return h(defnVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static Object h(defn defnVar) throws ExecutionException {
        if (defnVar.m()) {
            return defnVar.i();
        }
        if (defnVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(defnVar.h());
    }

    private static void i(defn defnVar, dega degaVar) {
        Executor executor = defu.b;
        defnVar.q(executor, degaVar);
        defnVar.p(executor, degaVar);
        defnVar.n(executor, degaVar);
    }
}
