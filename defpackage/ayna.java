package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayna {
    private static final cqce d = cqce.g("BugleThrottledAction", "ThrottledActionScheduler");
    protected final aymn a;
    protected final cogw b;
    private ThrottledAction e;
    private Class f;
    private long g = -1;
    private int h = 0;
    public ayno c = null;

    public ayna(cogw cogwVar, aymn aymnVar) {
        this.b = cogwVar;
        this.a = aymnVar;
    }

    private final synchronized ThrottledAction e(ThrottledAction throttledAction) {
        ThrottledAction throttledAction2 = this.e;
        if (throttledAction2 != null || this.g != -1) {
            throttledAction = throttledAction2;
        }
        if (throttledAction != null) {
            cqce cqceVar = d;
            if (cqceVar.t(3)) {
                cqbd cqbdVarD = cqceVar.d();
                cqbdVarD.I(throttledAction.h());
                cqbdVarD.I("is starting.");
                cqbdVarD.r();
            }
        }
        c(this.b.a());
        this.e = null;
        this.c = null;
        return throttledAction;
    }

    private final void f(ThrottledAction throttledAction) {
        Class<?> cls = this.f;
        Class<?> cls2 = throttledAction.getClass();
        if (cls == null) {
            this.f = cls2;
            return;
        }
        if (cls != cls2) {
            cqaz.o("Expected instance '" + String.valueOf(cls) + "' but got instance '" + String.valueOf(cls2) + "'");
        }
    }

    private final synchronized void g(Action action, int i, long j, boolean z) throws Throwable {
        try {
            try {
                ayno aynoVar = this.c;
                if (aynoVar == null) {
                    this.a.f(this.e, this.h);
                    j(action, i, j, false);
                    return;
                }
                cczi ccziVar = ayns.b;
                aynoVar.a.removeCallbacks(aynoVar.b);
                this.c = null;
                this.e.getClass();
                j(action, i, j, z);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private static void h(ThrottledAction throttledAction) {
        if (throttledAction != null) {
            cqce cqceVar = d;
            if (cqceVar.t(3)) {
                cqbd cqbdVarD = cqceVar.d();
                cqbdVarD.I(throttledAction.h());
                cqbdVarD.I("is done.");
                cqbdVarD.r();
            }
        }
    }

    private static void i(ThrottledAction throttledAction, int i, long j) {
        String strH = throttledAction != null ? throttledAction.h() : "????";
        if (i == 0) {
            cqbd cqbdVarD = d.d();
            cqbdVarD.I(strH);
            cqbdVarD.I("already scheduled in");
            cqbdVarD.H(j);
            cqbdVarD.I("ms, not scheduling it again.");
            cqbdVarD.r();
            return;
        }
        if (i == 1) {
            cqbd cqbdVarD2 = d.d();
            cqbdVarD2.I(strH);
            cqbdVarD2.I("scheduled in");
            cqbdVarD2.H(j);
            cqbdVarD2.I("ms, so not scheduled again.");
            cqbdVarD2.r();
            return;
        }
        if (i == 2) {
            cqbd cqbdVarD3 = d.d();
            cqbdVarD3.I(strH);
            cqbdVarD3.I("scheduled to run now.");
            cqbdVarD3.r();
            return;
        }
        cqbd cqbdVarD4 = d.d();
        cqbdVarD4.I("Reduced delay of");
        cqbdVarD4.I(strH);
        cqbdVarD4.I("to");
        cqbdVarD4.H(j);
        cqbdVarD4.I("ms.");
        cqbdVarD4.r();
    }

    private final synchronized void j(Action action, int i, long j, boolean z) {
        if (z) {
            this.c = this.a.i(action, j);
        } else {
            this.a.g(this.e, i, j);
        }
        this.h = i;
    }

    public final eiju a(ThrottledAction throttledAction) {
        f(throttledAction);
        ThrottledAction throttledActionE = e(throttledAction);
        if (throttledActionE == null) {
            h(null);
            return eijx.e(null);
        }
        try {
            return throttledActionE.k();
        } finally {
            h(throttledActionE);
        }
    }

    public final ListenableFuture b(ThrottledAction throttledAction, int i, cldb cldbVar) {
        int i2;
        ListenableFuture listenableFutureC;
        f(throttledAction);
        synchronized (this) {
            ThrottledAction throttledAction2 = this.e;
            if (throttledAction2 != null) {
                throttledAction2.j(throttledAction);
                this.a.f(this.e, this.h);
                i2 = 3;
            } else {
                this.e = throttledAction;
                i2 = 2;
            }
            listenableFutureC = this.a.c(this.e, cldbVar, i);
            this.h = i;
        }
        i(this.e, i2, 0L);
        return listenableFutureC;
    }

    final synchronized void c(long j) {
        this.g = j;
    }

    public final void d(ThrottledAction throttledAction, int i, long j, long j2, boolean z) {
        long j3;
        int i2;
        f(throttledAction);
        double d2 = j;
        double d3 = j2;
        if (d2 > d3) {
            cqaz.o("Expected at most " + d3 + " but got " + d2);
        }
        long jA = this.b.a();
        long j4 = j + jA;
        long j5 = jA + j2;
        synchronized (this) {
            long jA2 = this.b.a();
            long jG = this.g + throttledAction.g();
            ThrottledAction throttledAction2 = this.e;
            if (throttledAction2 != null) {
                throttledAction2.j(throttledAction);
                if (j5 < jG) {
                    long j6 = j5 - jA2;
                    g(throttledAction, i, j6, z);
                    i2 = 3;
                    j3 = j6;
                } else {
                    j3 = jG - jA2;
                    i2 = 0;
                }
            } else {
                this.e = throttledAction;
                long j7 = jG <= j4 ? j4 - jA2 : j5 <= jG ? j5 - jA2 : jG - jA2;
                j(throttledAction, i, j7, z);
                j3 = j7;
                this.h = i;
                i2 = j3 <= 0 ? 2 : 1;
            }
        }
        i(this.e, i2, j3);
    }
}
