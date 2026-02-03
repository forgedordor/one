package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amx extends CameraDevice.StateCallback {
    final /* synthetic */ kog a;
    final /* synthetic */ anm b;

    public amx(anm anmVar, kog kogVar) {
        this.b = anmVar;
        this.a = kogVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.b.q("openCameraConfigAndClose camera closed");
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.q("openCameraConfigAndClose camera disconnected");
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        this.b.q(a.g(i, "openCameraConfigAndClose camera error "));
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        anm anmVar = this.b;
        anmVar.q("openCameraConfigAndClose camera opened");
        final aql aqlVar = new aql(anmVar.y, false);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final bkx bkxVar = new bkx(surface);
        bkxVar.c().b(new Runnable() { // from class: aml
            @Override // java.lang.Runnable
            public final void run() {
                surface.release();
                surfaceTexture.release();
            }
        }, bpc.a());
        bmd bmdVar = new bmd();
        bmdVar.i(bkxVar);
        bmdVar.t(1);
        anmVar.q("Start configAndClose.");
        final ListenableFuture listenableFutureB = aqlVar.b(bmdVar.b(), cameraDevice, anmVar.v.a());
        bpw bpwVarA = bpw.a(kol.a(new koi() { // from class: bpy
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                Runnable runnable = new Runnable() { // from class: bpz
                    @Override // java.lang.Runnable
                    public final void run() {
                        kogVar.b(null);
                    }
                };
                ListenableFuture listenableFuture = listenableFutureB;
                listenableFuture.b(runnable, bpc.a());
                return "transformVoidFuture [" + listenableFuture + "]";
            }
        }));
        bpr bprVar = new bpr() { // from class: amm
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                aql aqlVar2 = aqlVar;
                aqlVar2.f();
                bkxVar.d();
                return aqlVar2.p();
            }
        };
        Executor executor = anmVar.c;
        ListenableFuture listenableFutureG = bqk.g(bpwVarA, bprVar, executor);
        cameraDevice.getClass();
        listenableFutureG.b(new Runnable() { // from class: amw
            @Override // java.lang.Runnable
            public final void run() {
                cameraDevice.close();
            }
        }, executor);
    }
}
