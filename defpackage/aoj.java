package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoj {
    public final int b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final amb e;
    public final axh f;
    public final boolean g;
    public long h = k;
    final List i = new ArrayList();
    public final aok j = new aoh(this);
    private static final long k = TimeUnit.SECONDS.toNanos(1);
    public static final long a = TimeUnit.SECONDS.toNanos(5);

    public aoj(int i, Executor executor, ScheduledExecutorService scheduledExecutorService, amb ambVar, boolean z, axh axhVar) {
        this.b = i;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = ambVar;
        this.g = z;
        this.f = axhVar;
    }

    public final ListenableFuture a(final int i) {
        ListenableFuture listenableFutureB = bqk.b(null);
        if (this.i.isEmpty()) {
            return listenableFutureB;
        }
        bpw bpwVarA = bpw.a(this.j.c() ? apj.b(this.e, null) : bqk.b(null));
        bpr bprVar = new bpr() { // from class: aod
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                aoj aojVar = this.a;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                boolean z = aojVar.e.k;
                if (apj.e(i, totalCaptureResult)) {
                    aojVar.h = aoj.a;
                }
                return aojVar.j.a(totalCaptureResult);
            }
        };
        Executor executor = this.c;
        return bqk.g(bqk.g(bpwVarA, bprVar, executor), new bpr() { // from class: aoe
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return bqk.b(null);
                }
                aoj aojVar = this.a;
                return apj.c(aojVar.h, aojVar.d, aojVar.e, new aom() { // from class: aof
                    @Override // defpackage.aom
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        long j = aoj.a;
                        return apj.d(totalCaptureResult, false);
                    }
                });
            }
        }, executor);
    }

    final void b(aok aokVar) {
        this.i.add(aokVar);
    }

    public final void c() {
        this.j.b();
    }
}
