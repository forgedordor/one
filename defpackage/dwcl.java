package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcl implements fcrx {
    public fcrp a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ dvqz c;
    final /* synthetic */ UUID d;
    final /* synthetic */ dwje e;
    final /* synthetic */ dwcm f;
    final /* synthetic */ dwft g;

    public dwcl(dwcm dwcmVar, SettableFuture settableFuture, dvqz dvqzVar, dwft dwftVar, UUID uuid, dwje dwjeVar) {
        this.b = settableFuture;
        this.c = dvqzVar;
        this.g = dwftVar;
        this.d = uuid;
        this.e = dwjeVar;
        this.f = dwcmVar;
    }

    @Override // defpackage.fcsf
    public final void a() {
        dvmi dvmiVar = ((dvmh) this.c).a;
        dvhv.a("MsgReceiver", "BindV2 stream onCompleted for ".concat(((dwiq) dvmiVar.b.c().f()).a));
        dvmiVar.f();
        dvka.a();
        Context context = dvmiVar.c;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.processName.contains(context.getPackageName())) {
                    if (next.importance == 100 || next.importance == 200) {
                        dvmiVar.b();
                    }
                }
            }
        }
        dvmiVar.o.a();
        this.a = null;
    }

    @Override // defpackage.fcsf
    public final void b(Throwable th) {
        long micros = 0;
        try {
            SettableFuture settableFuture = this.b;
            if (settableFuture.isDone()) {
                micros = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) settableFuture.q()).longValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            dvhv.b("Backend", "Unexpected exception", e);
        }
        final dvmi dvmiVar = ((dvmh) this.c).a;
        dvmiVar.f();
        Status statusC = Status.c(th);
        if (statusC == null || !Status.Code.CANCELLED.equals(statusC.getCode())) {
            dvhv.d("MsgReceiver", "BindV2 stream error for ".concat(((dwiq) dvmiVar.b.c().f()).a), th);
            dvke dvkeVar = dvmiVar.o;
            Context context = dvmiVar.c;
            eosc eoscVar = dvmiVar.j;
            if (fbfm.a.get().l() && dvjv.a(context) && Status.Code.UNAVAILABLE.equals(statusC.getCode()) && dvkeVar.b > 0) {
                Random random = dvkeVar.a;
                dvxd dvxdVar = (dvxd) dvxj.g;
                int iNextInt = random.nextInt(dvxdVar.e);
                int i = dvkeVar.b;
                int i2 = (i == 3 ? (int) dvxdVar.c : (int) (dvxdVar.d * dvkeVar.c)) + iNextInt;
                dvkeVar.c = i2;
                dvkeVar.b = i - 1;
                final ejxr ejxrVar = new ejxr() { // from class: dvkd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return dvmiVar.b();
                    }
                };
                final long j = i2;
                dvkeVar.d = eooq.g(eoscVar.submit(new Callable() { // from class: dvjn
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws InterruptedException {
                        long j2 = j;
                        try {
                            if (dvjq.a == null) {
                                dvjq.a = dvjz.a();
                            }
                            Thread.sleep(j2);
                            return null;
                        } catch (InterruptedException e2) {
                            dvhv.d("FutureUtils", "error when sleeping", e2);
                            throw e2;
                        }
                    }
                }), new eooz() { // from class: dvjo
                    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ejxrVar.get();
                    }
                }, eoscVar);
            } else {
                dvmiVar.l.h(4);
            }
        } else {
            dvhv.b("MsgReceiver", "BindV2 stream CANCELLED for ".concat(((dwiq) dvmiVar.b.c().f()).a), th);
        }
        dwft dwftVar = this.g;
        UUID uuid = this.d;
        int iValue = Status.c(th).getCode().value();
        dwcm dwcmVar = this.f;
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = dwftVar.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(11);
        dwhpVarR.m(Integer.valueOf(iValue));
        dwhpVarR.f(5);
        dwhpVarR.e(micros);
        dwcmVar.c.b(dwhpVarR.a());
        this.a = null;
        if (dwda.b().c(th) == felx.REGISTRATION_NOT_FOUND) {
            dwje dwjeVar2 = this.e;
            dvhv.f("Backend", "Registration was not found for streaming RPC. This was likely deleted from a Tachyon Janitor job or Unregistered previously.");
            dwcmVar.e.d(dwjeVar2.c().f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0617 A[Catch: ExecutionException -> 0x062d, InterruptedException | ExecutionException -> 0x062f, TRY_LEAVE, TryCatch #8 {InterruptedException | ExecutionException -> 0x062f, blocks: (B:272:0x060f, B:274:0x0617), top: B:317:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    @Override // defpackage.fcsf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwcl.c(java.lang.Object):void");
    }

    @Override // defpackage.fcrx
    public final void d(fcrp fcrpVar) {
        this.b.set(Long.valueOf(SystemClock.elapsedRealtime()));
        this.a = fcrpVar;
        ((dvmh) this.c).b = new dwck(this);
    }
}
