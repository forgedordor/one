package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apc implements aok {
    public static final long a = TimeUnit.SECONDS.toNanos(2);
    public final amb b;
    public final ScheduledExecutorService c;
    public final bbd d;
    public final axu e;
    private final Executor f;

    public apc(amb ambVar, Executor executor, ScheduledExecutorService scheduledExecutorService, axu axuVar) {
        this.b = ambVar;
        this.f = executor;
        this.c = scheduledExecutorService;
        this.e = axuVar;
        bbd bbdVar = ambVar.j;
        bbdVar.getClass();
        this.d = bbdVar;
    }

    @Override // defpackage.aok
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        bbs.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
        final AtomicReference atomicReference = new AtomicReference();
        final ListenableFuture listenableFutureA = kol.a(new koi() { // from class: aow
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                long j = apc.a;
                atomicReference.set(new bbe() { // from class: aov
                    @Override // defpackage.bbe
                    public final void a() {
                        long j2 = apc.a;
                        bbs.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                        kogVar.b(null);
                    }
                });
                return "OnScreenFlashUiApplied";
            }
        });
        bpw bpwVarA = bpw.a(kol.a(new koi() { // from class: aox
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                ScheduledExecutorService scheduledExecutorServiceA = bpn.a();
                final apc apcVar = this.a;
                final AtomicReference atomicReference2 = atomicReference;
                scheduledExecutorServiceA.execute(new Runnable() { // from class: aot
                    @Override // java.lang.Runnable
                    public final void run() {
                        bbs.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                        apcVar.d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (bbe) atomicReference2.get());
                        kogVar.b(null);
                    }
                });
                return "OnScreenFlashStart";
            }
        }));
        bpr bprVar = new bpr() { // from class: aoy
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                return this.a.b.d.a(true);
            }
        };
        Executor executor = this.f;
        return bqk.f(bqk.g(bqk.g(bqk.g(bqk.g(bqk.g(bpwVarA, bprVar, executor), new bpr() { // from class: aoz
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                final apc apcVar = this.a;
                return kol.a(new koi() { // from class: aoo
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        apc apcVar2 = apcVar;
                        if (!apcVar2.e.a()) {
                            kogVar.b(null);
                            return "EnableTorchInternal";
                        }
                        bbs.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
                        apcVar2.b.v(2);
                        kogVar.b(null);
                        return "EnableTorchInternal";
                    }
                });
            }
        }, executor), new bpr() { // from class: apa
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                return bqk.k(TimeUnit.SECONDS.toMillis(3L), this.a.c, listenableFutureA);
            }
        }, executor), new bpr() { // from class: apb
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                return this.a.b.d.b();
            }
        }, executor), new bpr() { // from class: aop
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                long j = apc.a;
                aom aomVar = new aom() { // from class: aou
                    @Override // defpackage.aom
                    public final boolean a(TotalCaptureResult totalCaptureResult2) {
                        long j2 = apc.a;
                        return apj.d(totalCaptureResult2, false);
                    }
                };
                apc apcVar = this.a;
                return apj.c(j, apcVar.c, apcVar.b, aomVar);
            }
        }, executor), new akv() { // from class: aoq
            @Override // defpackage.akv
            public final Object a(Object obj) {
                long j = apc.a;
                return false;
            }
        }, bpc.a());
    }

    @Override // defpackage.aok
    public final void b() {
        bbs.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
        if (this.e.a()) {
            this.b.v(0);
        }
        ark arkVar = this.b.d;
        arkVar.a(false).b(new Runnable() { // from class: aor
            @Override // java.lang.Runnable
            public final void run() {
                long j = apc.a;
                Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
            }
        }, this.f);
        arkVar.d(false, true);
        final bbd bbdVar = this.d;
        bpn.a().execute(new Runnable() { // from class: aos
            @Override // java.lang.Runnable
            public final void run() {
                ((brg) bbdVar).c();
            }
        });
    }

    @Override // defpackage.aok
    public final boolean c() {
        return false;
    }
}
