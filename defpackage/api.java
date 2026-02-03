package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class api implements aok {
    public static final long a = TimeUnit.SECONDS.toNanos(2);
    public final amb b;
    public final ScheduledExecutorService c;
    public final boolean d;
    private final int e;
    private boolean f = false;
    private final Executor g;

    public api(amb ambVar, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.b = ambVar;
        this.e = i;
        this.g = executor;
        this.c = scheduledExecutorService;
        this.d = z;
    }

    @Override // defpackage.aok
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        int i = this.e;
        bbs.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + apj.e(i, totalCaptureResult));
        if (apj.e(i, totalCaptureResult)) {
            amb ambVar = this.b;
            boolean z = ambVar.k;
            if (!ambVar.I()) {
                bbs.a("Camera2CapturePipeline", "Turn on torch");
                this.f = true;
                bpw bpwVarA = bpw.a(kol.a(new koi() { // from class: ape
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        this.a.b.f.a(kogVar, 2);
                        return "TorchOn";
                    }
                }));
                bpr bprVar = new bpr() { // from class: apf
                    @Override // defpackage.bpr
                    public final ListenableFuture a(Object obj) {
                        api apiVar = this.a;
                        return apiVar.d ? apiVar.b.d.b() : bqk.b(null);
                    }
                };
                Executor executor = this.g;
                return bqk.f(bqk.g(bqk.g(bpwVarA, bprVar, executor), new bpr() { // from class: apg
                    @Override // defpackage.bpr
                    public final ListenableFuture a(Object obj) {
                        long j = api.a;
                        aom aomVar = new aom() { // from class: apd
                            @Override // defpackage.aom
                            public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                long j2 = api.a;
                                return apj.d(totalCaptureResult2, true);
                            }
                        };
                        api apiVar = this.a;
                        return apj.c(j, apiVar.c, apiVar.b, aomVar);
                    }
                }, executor), new akv() { // from class: aph
                    @Override // defpackage.akv
                    public final Object a(Object obj) {
                        long j = api.a;
                        return false;
                    }
                }, bpc.a());
            }
            bbs.a("Camera2CapturePipeline", "Torch already on, not turn on");
        }
        return bqk.b(false);
    }

    @Override // defpackage.aok
    public final void b() {
        if (this.f) {
            amb ambVar = this.b;
            ambVar.f.a(null, 0);
            bbs.a("Camera2CapturePipeline", "Turning off torch");
            if (this.d) {
                ambVar.d.d(false, true);
            }
        }
    }

    @Override // defpackage.aok
    public final boolean c() {
        return this.e == 0;
    }
}
