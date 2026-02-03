package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.research.xeno.effect.InputFrameSource;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buj implements btz {
    public final bcv a;
    public final lbz b;
    private final Executor c;

    public buj(ayy ayyVar) {
        bcv bcvVarA = ayyVar.a();
        bcvVarA.getClass();
        this.a = bcvVarA;
        this.c = ayyVar.b;
        this.b = ayyVar.c;
    }

    @Override // defpackage.bcv
    public final void a(final bdp bdpVar) {
        this.c.execute(new Runnable() { // from class: buh
            @Override // java.lang.Runnable
            public final void run() {
                buj bujVar = this.a;
                bdp bdpVar2 = bdpVar;
                try {
                    bcv bcvVar = bujVar.a;
                    Size size = bdpVar2.c;
                    ((exlx) bcvVar).g = size.getWidth();
                    ((exlx) bcvVar).h = size.getHeight();
                    Log.i(exlx.a, String.format("onInputSurface requested width %d, height %d", Integer.valueOf(((exlx) bcvVar).g), Integer.valueOf(((exlx) bcvVar).h)));
                    euwf euwfVar = ((exlx) bcvVar).c;
                    euwfVar.a.e(((exlx) bcvVar).h, ((exlx) bcvVar).g);
                    euwe euweVar = euwfVar.a;
                    SurfaceTexture surfaceTexture = euweVar.a != null ? euweVar.a : euweVar.b;
                    surfaceTexture.setDefaultBufferSize(((exlx) bcvVar).g, ((exlx) bcvVar).h);
                    bdpVar2.b(new Surface(surfaceTexture), bpn.a(), new lbz() { // from class: exlt
                        @Override // defpackage.lbz
                        public final void accept(Object obj) {
                            String str = exlx.a;
                            ((bdm) obj).b().release();
                        }
                    });
                    ((exlx) bcvVar).c(InputFrameSource.BACK_CAMERA);
                } catch (bci e) {
                    bbs.d("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e);
                    bujVar.b.accept(e);
                }
            }
        });
    }

    @Override // defpackage.bcv
    public final void b(final bcu bcuVar) {
        this.c.execute(new Runnable() { // from class: bui
            @Override // java.lang.Runnable
            public final void run() {
                buj bujVar = this.a;
                bcu bcuVar2 = bcuVar;
                try {
                    bcv bcvVar = bujVar.a;
                    int width = bcuVar2.b().getWidth();
                    int height = bcuVar2.b().getHeight();
                    String str = exlx.a;
                    Log.i(str, String.format("onOutputSurface requested width %d, height %d", Integer.valueOf(width), Integer.valueOf(height)));
                    final exlx exlxVar = (exlx) bcvVar;
                    Surface surfaceC = bcuVar2.c(bpn.a(), new lbz() { // from class: exlu
                        @Override // defpackage.lbz
                        public final void accept(Object obj) {
                            exlx exlxVar2 = exlxVar;
                            bct bctVar = (bct) obj;
                            exlw exlwVar = exlxVar2.f;
                            if (exlwVar != null) {
                                exlxVar2.d.h.remove(exlwVar);
                                exlxVar2.f.l();
                                try {
                                    exlxVar2.f.join();
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    Log.e(exlx.a, "Xeno Render thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
                                    throw new IllegalStateException(e);
                                }
                            }
                            bctVar.a().close();
                        }
                    });
                    ((exlx) bcvVar).e = new euwg();
                    euwg euwgVar = ((exlx) bcvVar).e;
                    if (euwgVar.c != 0) {
                        throw new IllegalStateException("setTextureTarget must be called before the surface is created");
                    }
                    euwgVar.d = 3553;
                    ((exlx) bcvVar).f = new exlw(((exlx) bcvVar).b.c, surfaceC, euwgVar, width, height);
                    ((exlx) bcvVar).f.setName("XenoRenderThread");
                    ((exlx) bcvVar).f.start();
                    try {
                        if (!((exlx) bcvVar).f.k()) {
                            Log.e(str, "RenderThread startup failed.");
                        }
                    } catch (InterruptedException e) {
                        Log.e(exlx.a, "RenderThread exception ".concat(e.toString()));
                    }
                    exkx exkxVar = ((exlx) bcvVar).d;
                    exlw exlwVar = ((exlx) bcvVar).f;
                    CopyOnWriteArraySet copyOnWriteArraySet = exkxVar.h;
                    copyOnWriteArraySet.clear();
                    if (exlwVar != null) {
                        copyOnWriteArraySet.add(exlwVar);
                    }
                } catch (bci e2) {
                    bbs.d("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e2);
                    bujVar.b.accept(e2);
                }
            }
        });
    }

    @Override // defpackage.btz
    public final ListenableFuture c(int i, int i2) {
        return new bql(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // defpackage.btz
    public final void g() {
    }
}
