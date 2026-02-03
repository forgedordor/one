package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclu implements fcmd {
    public final fcmc a;
    public Future b;
    final /* synthetic */ fclv c;

    public fclu(fclv fclvVar, fcmc fcmcVar) {
        this.c = fclvVar;
        this.a = fcmcVar;
    }

    @Override // defpackage.fcmd
    public final void a(fcma fcmaVar, String str, fbrg fbrgVar) {
        Executor fckyVar;
        fbnz fbnzVar;
        fcmaVar.k();
        int i = fcsr.a;
        fclv fclvVar = this.c;
        if (fclvVar.d != eoqg.a) {
            fckyVar = new fclc(fclvVar.d);
        } else {
            fckyVar = new fcky();
            fcmaVar.f();
        }
        Executor executor = fckyVar;
        fbrb fbrbVar = fcdy.c;
        boolean z = true;
        if (fbrgVar.i(fbrbVar)) {
            String str2 = (String) fbrgVar.c(fbrbVar);
            if (fclvVar.p.a(str2) == null) {
                fcmaVar.i(fclv.c);
                fcmaVar.e(Status.n.withDescription(String.format("Can't find decompressor for %s", str2)), new fbrg());
                return;
            }
            fcmaVar.j();
        }
        fcmm fcmmVarB = fcmaVar.b();
        fcmmVarB.getClass();
        Long l = (Long) fbrgVar.c(fcdy.b);
        fbog fbogVar = fclvVar.o;
        fbtg[] fbtgVarArr = fcmmVarB.b;
        if (fbtgVarArr.length > 0) {
            throw null;
        }
        fbog fbogVarL = fbogVar.l(fbpq.a, fclvVar);
        if (l == null) {
            fbnzVar = new fbnz(fbogVarL);
        } else {
            fbol fbolVarD = fbol.d(l.longValue(), TimeUnit.NANOSECONDS, fclvVar.s);
            ScheduledExecutorService scheduledExecutorServiceR = this.a.r();
            fbog.m(scheduledExecutorServiceR, "scheduler");
            fbol fbolVarB = fbogVarL.b();
            if (fbolVarB != null && fbolVarB.compareTo(fbolVarD) <= 0) {
                z = false;
                fbolVarD = fbolVarB;
            }
            fbnz fbnzVar2 = new fbnz(fbogVarL, fbolVarD);
            if (z) {
                if (fbolVarD.g()) {
                    fbnzVar2.j(new TimeoutException("context timed out"));
                } else {
                    synchronized (fbnzVar2) {
                        fbny fbnyVar = new fbny(fbnzVar2);
                        scheduledExecutorServiceR.getClass();
                        fbnzVar2.b = scheduledExecutorServiceR.schedule(fbnyVar, fbolVarD.c - System.nanoTime(), TimeUnit.NANOSECONDS);
                    }
                }
            }
            fbnzVar = fbnzVar2;
        }
        fcll fcllVar = new fcll(executor, fclvVar.d, fcmaVar, fbnzVar);
        fcmaVar.i(fcllVar);
        SettableFuture settableFutureCreate = SettableFuture.create();
        fbnz fbnzVar3 = fbnzVar;
        executor.execute(new fclr(this, fbnzVar3, str, fcmaVar, fcllVar, settableFutureCreate, fcmmVarB, fbrgVar));
        executor.execute(new fclq(fbnzVar3, settableFutureCreate, fbrgVar, fcmaVar, fcllVar));
    }

    @Override // defpackage.fcmd
    public final void b() {
        Future future = this.b;
        if (future != null) {
            future.cancel(false);
            this.b = null;
        }
        fclv fclvVar = this.c;
        Iterator it = fclvVar.g.iterator();
        if (it.hasNext()) {
            throw null;
        }
        fcmc fcmcVar = this.a;
        synchronized (fclvVar.l) {
            if (!fclvVar.n.remove(fcmcVar)) {
                throw new AssertionError("Transport already removed");
            }
            fbpi.c((fbph) fclvVar.q.g.get(Long.valueOf(fbpi.a(fclvVar))), fcmcVar);
            fclvVar.e();
        }
    }

    @Override // defpackage.fcmd
    public final void c() {
        this.b.cancel(false);
        this.b = null;
        Iterator it = this.c.g.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
