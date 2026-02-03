package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drle implements drly {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/concurrent/Executors");
    public static volatile drle b;
    public final List c = new ArrayList();
    public final eosd d;
    public final eosd e;
    public final eosd f;
    public volatile eosd g;
    private final eosd h;
    private final drlk i;

    public drle(eosd eosdVar, eosd eosdVar2, eosd eosdVar3, eosd eosdVar4) {
        drle drleVar;
        if (eosdVar == null) {
            eosw eoswVar = new eosw();
            eoswVar.d("ImeScheduler-%d");
            eoswVar.c(true);
            eosdVar = eosj.b(Executors.newScheduledThreadPool(1, eosw.b(eoswVar)));
        }
        this.h = eosdVar;
        this.i = drxl.a ? new drlk(eosdVar, new ejvr() { // from class: drld
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrd ekrdVarA = drle.a.a(drub.a);
                ekrdVarA.V(1, TimeUnit.SECONDS);
                ((ekrd) ekrdVarA.h("com/google/android/libraries/inputmethod/concurrent/Executors", "createStalledTaskDetector", 471, "Executors.java")).t("Long-running task detected: %s", (String) obj);
                return null;
            }
        }) : null;
        this.d = eosdVar2 == null ? new drlb(e("Light-P0", 0, Math.max(2, Runtime.getRuntime().availableProcessors() - 2)), eosdVar) : eosdVar2;
        this.e = eosdVar3 == null ? new drlb(e("Back-P10", 10, 4), eosdVar) : eosdVar3;
        if (eosdVar4 == null) {
            drleVar = this;
            eosdVar4 = new drlb(drleVar.g("Block-P11", 11, 0, Alert.DURATION_SHOW_INDEFINITELY, new SynchronousQueue(), false), eosdVar);
        } else {
            drleVar = this;
        }
        drleVar.f = eosdVar4;
        drlx.a.a(this);
    }

    public static drle a() {
        drle drleVar;
        drle drleVar2 = b;
        if (drleVar2 != null) {
            return drleVar2;
        }
        synchronized (drle.class) {
            drleVar = b;
            if (drleVar == null) {
                drleVar = new drle(null, null, null, null);
                b = drleVar;
            }
        }
        return drleVar;
    }

    public static Executor b(Executor executor) {
        return c(executor) ? executor : new eoss(executor);
    }

    public static boolean c(Executor executor) {
        return d(executor) || executor == eoqg.a || (executor instanceof drlc) || (executor instanceof drlh);
    }

    public static boolean d(Executor executor) {
        if (executor != drlv.b) {
            return executor == (drxl.a ? drkq.a : eoqg.a) || executor == drlv.a;
        }
        return true;
    }

    public static drln f() {
        return drxl.a ? new drkr() : new drks();
    }

    private final eosc g(String str, int i, int i2, int i3, BlockingQueue blockingQueue, boolean z) {
        if (str.length() > 16) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/concurrent/Executors", "createThreadPoolExecutor", 592, "Executors.java")).t("createThreadPoolExecutor(): name[%s] exceeds limit", str);
            str = str.substring(0, 16);
        }
        drln drlnVarF = f();
        drlu drluVar = new drlu(z ? this.i : null, i2, i3, TimeUnit.MINUTES, blockingQueue, new drlg(str, i, drlnVarF));
        if (i2 > 0) {
            drluVar.allowCoreThreadTimeOut(true);
        }
        List list = this.c;
        synchronized (list) {
            list.add(drlnVarF);
            list.add(drluVar);
        }
        return eosj.a(drluVar);
    }

    final eosc e(String str, int i, int i2) {
        return g(str, i, i2, i2, new LinkedBlockingQueue(), true);
    }
}
