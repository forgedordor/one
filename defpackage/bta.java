package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bta implements SurfaceTexture.OnFrameAvailableListener, btz {
    public static final /* synthetic */ int i = 0;
    public final btg a;
    final HandlerThread b;
    public final Executor c;
    final Handler d;
    final Map e;
    public int f;
    public boolean g;
    public final List h;
    private final AtomicBoolean j;
    private final float[] k;
    private final float[] l;

    public bta(final azv azvVar) {
        final Map map = Collections.EMPTY_MAP;
        this.j = new AtomicBoolean(false);
        this.k = new float[16];
        this.l = new float[16];
        this.e = new LinkedHashMap();
        this.f = 0;
        this.g = false;
        this.h = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new bpi(handler);
        this.a = new btg();
        try {
            try {
                kol.a(new koi() { // from class: bss
                    @Override // defpackage.koi
                    public final Object a(final kog kogVar) {
                        final bta btaVar = this.a;
                        final azv azvVar2 = azvVar;
                        final Map map2 = map;
                        btaVar.e(new Runnable() { // from class: bst
                            @Override // java.lang.Runnable
                            public final void run() {
                                azv azvVar3 = azvVar2;
                                bta btaVar2 = btaVar;
                                Map map3 = map2;
                                kog kogVar2 = kogVar;
                                try {
                                    btaVar2.a.j(azvVar3, map3);
                                    kogVar2.b(null);
                                } catch (RuntimeException e) {
                                    kogVar2.c(e);
                                }
                            }
                        });
                        return "Init GlRenderer";
                    }
                }).get();
            } catch (InterruptedException | ExecutionException e) {
                Throwable cause = e instanceof ExecutionException ? e.getCause() : e;
                if (!(cause instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", cause);
                }
                throw ((RuntimeException) cause);
            }
        } catch (RuntimeException e2) {
            g();
            throw e2;
        }
    }

    private final void h(Throwable th) {
        List list = this.h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bsz) it.next()).c().c(th);
        }
        list.clear();
    }

    @Override // defpackage.bcv
    public final void a(final bdp bdpVar) {
        if (this.j.get()) {
            bdpVar.f();
        } else {
            f(new Runnable() { // from class: bsj
                @Override // java.lang.Runnable
                public final void run() {
                    final bta btaVar = this.a;
                    btaVar.f++;
                    btg btgVar = btaVar.a;
                    buw.h(btgVar.a, true);
                    buw.g(btgVar.c);
                    final SurfaceTexture surfaceTexture = new SurfaceTexture(btgVar.m);
                    final bdp bdpVar2 = bdpVar;
                    Size size = bdpVar2.c;
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    final Surface surface = new Surface(surfaceTexture);
                    bdo bdoVar = new bdo() { // from class: bsq
                        @Override // defpackage.bdo
                        public final void a(bdn bdnVar) {
                            azv azvVar = bdpVar2.d;
                            but butVar = but.DEFAULT;
                            if (azvVar.a() && ((ayu) bdnVar).d) {
                                butVar = but.YUV;
                            }
                            btg btgVar2 = btaVar.a;
                            buw.h(btgVar2.a, true);
                            buw.g(btgVar2.c);
                            if (btgVar2.l != butVar) {
                                btgVar2.l = butVar;
                                btgVar2.h(btgVar2.m);
                            }
                        }
                    };
                    Executor executor = btaVar.c;
                    bdpVar2.c(executor, bdoVar);
                    bdpVar2.b(surface, executor, new lbz() { // from class: bsr
                        @Override // defpackage.lbz
                        public final void accept(Object obj) {
                            bdp bdpVar3 = bdpVar2;
                            synchronized (bdpVar3.b) {
                                bdpVar3.l = null;
                                bdpVar3.m = null;
                            }
                            Surface surface2 = surface;
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            bta btaVar2 = btaVar;
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            surfaceTexture2.release();
                            surface2.release();
                            btaVar2.f--;
                            btaVar2.d();
                        }
                    });
                    surfaceTexture.setOnFrameAvailableListener(btaVar, btaVar.d);
                }
            }, new Runnable() { // from class: bsk
                @Override // java.lang.Runnable
                public final void run() {
                    bdpVar.f();
                }
            });
        }
    }

    @Override // defpackage.bcv
    public final void b(final bcu bcuVar) {
        if (this.j.get()) {
            bcuVar.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: bsu
            @Override // java.lang.Runnable
            public final void run() {
                final bta btaVar = this.a;
                final bcu bcuVar2 = bcuVar;
                Surface surfaceC = bcuVar2.c(btaVar.c, new lbz() { // from class: bsp
                    @Override // defpackage.lbz
                    public final void accept(Object obj) {
                        bcu bcuVar3 = bcuVar2;
                        bcuVar3.close();
                        bta btaVar2 = btaVar;
                        Surface surface = (Surface) btaVar2.e.remove(bcuVar3);
                        if (surface != null) {
                            btaVar2.a.g(surface);
                        }
                    }
                });
                btaVar.a.d(surfaceC);
                btaVar.e.put(bcuVar2, surfaceC);
            }
        };
        bcuVar.getClass();
        f(runnable, new Runnable() { // from class: bsv
            @Override // java.lang.Runnable
            public final void run() {
                bcuVar.close();
            }
        });
    }

    @Override // defpackage.btz
    public final ListenableFuture c(final int i2, final int i3) {
        return bqk.d(kol.a(new koi() { // from class: bsn
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final bsf bsfVar = new bsf(i2, i3, kogVar);
                final bta btaVar = this.a;
                btaVar.f(new Runnable() { // from class: bsi
                    @Override // java.lang.Runnable
                    public final void run() {
                        btaVar.h.add(bsfVar);
                    }
                }, new Runnable() { // from class: bso
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = bta.i;
                        kogVar.c(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                    }
                });
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    public final void d() {
        if (this.g && this.f == 0) {
            Map map = this.e;
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                ((bcu) it.next()).close();
            }
            Iterator it2 = this.h.iterator();
            while (it2.hasNext()) {
                ((bsz) it2.next()).c().c(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            map.clear();
            this.a.e();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable) {
        f(runnable, new Runnable() { // from class: bsw
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = bta.i;
            }
        });
    }

    public final void f(final Runnable runnable, final Runnable runnable2) {
        try {
            this.c.execute(new Runnable() { // from class: bsl
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.a.g) {
                        runnable2.run();
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            bbs.g("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // defpackage.btz
    public final void g() {
        if (this.j.getAndSet(true)) {
            return;
        }
        e(new Runnable() { // from class: bsm
            @Override // java.lang.Runnable
            public final void run() {
                bta btaVar = this.a;
                btaVar.g = true;
                btaVar.d();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[Catch: RuntimeException -> 0x00ea, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x00ea, blocks: (B:10:0x004d, B:12:0x0066, B:14:0x006c, B:16:0x0076, B:18:0x007b), top: B:99:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[Catch: RuntimeException -> 0x00e8, TryCatch #1 {RuntimeException -> 0x00e8, blocks: (B:20:0x008f, B:22:0x00a0, B:24:0x00a9, B:25:0x00ae, B:27:0x00cc), top: B:94:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[Catch: RuntimeException -> 0x00e8, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00e8, blocks: (B:20:0x008f, B:22:0x00a0, B:24:0x00a9, B:25:0x00ae, B:27:0x00cc), top: B:94:0x008f }] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFrameAvailable(android.graphics.SurfaceTexture r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bta.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }
}
