package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ank extends CameraDevice.StateCallback {
    ScheduledFuture a;
    final /* synthetic */ anm b;
    private final Executor c;
    private final ScheduledExecutorService d;
    private anj e;
    private final anh f;

    public ank(anm anmVar, Executor executor, ScheduledExecutorService scheduledExecutorService, long j) {
        this.b = anmVar;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.f = new anh(this, j);
    }

    final void a() {
        this.f.d();
    }

    final void b() {
        lcg.c(this.e == null);
        lcg.c(this.a == null);
        anh anhVar = this.f;
        if (anhVar.c() >= anhVar.b()) {
            anhVar.d();
            bbs.c("Camera2CameraImpl", "Camera reopening attempted for " + anhVar.b() + "ms without success.");
            this.b.M(4, null, false);
            return;
        }
        this.e = new anj(this, this.c);
        anm anmVar = this.b;
        anmVar.q("Attempting camera re-open in " + anhVar.a() + "ms: " + this.e + " activeResuming = " + anmVar.x);
        this.a = this.d.schedule(this.e, (long) anhVar.a(), TimeUnit.MILLISECONDS);
    }

    final boolean c() {
        if (this.a == null) {
            return false;
        }
        anm anmVar = this.b;
        anj anjVar = this.e;
        Objects.toString(anjVar);
        anmVar.q("Cancelling scheduled re-open: ".concat(String.valueOf(anjVar)));
        this.e.a = true;
        this.e = null;
        this.a.cancel(false);
        this.a = null;
        return true;
    }

    final boolean d() {
        anm anmVar = this.b;
        if (!anmVar.x) {
            return false;
        }
        int i = anmVar.i;
        return i == 1 || i == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        anm anmVar = this.b;
        anmVar.q("CameraDevice.onClosed()");
        CameraDevice cameraDevice2 = anmVar.h;
        Objects.toString(cameraDevice);
        lcg.d(cameraDevice2 == null, "Unexpected onClose callback on camera device: ".concat(String.valueOf(cameraDevice)));
        int i = anmVar.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 5) {
            lcg.c(anmVar.J());
            anmVar.p();
            return;
        }
        if (i2 != 6 && i2 != 7) {
            int i3 = anmVar.A;
            Objects.toString(ang.a(i3));
            throw new IllegalStateException("Camera closed while in state: ".concat(ang.a(i3)));
        }
        int i4 = anmVar.i;
        if (i4 == 0) {
            anmVar.D(false);
        } else {
            anmVar.q("Camera closed due to error: ".concat(anm.j(i4)));
            b();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.q("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(android.hardware.camera2.CameraDevice r12, int r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ank.onError(android.hardware.camera2.CameraDevice, int):void");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        anm anmVar = this.b;
        anmVar.q("CameraDevice.onOpened()");
        anmVar.h = cameraDevice;
        anmVar.i = 0;
        a();
        int i = anmVar.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 5) {
            lcg.c(anmVar.J());
            anmVar.h.close();
            anmVar.h = null;
        } else {
            if (i2 != 6 && i2 != 7 && i2 != 8) {
                int i3 = anmVar.A;
                Objects.toString(ang.a(i3));
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(ang.a(i3)));
            }
            anmVar.K(10);
            cameraDevice.getId();
            anmVar.p.a(anmVar.h.getId());
            anmVar.q.f();
            anmVar.y();
        }
    }
}
