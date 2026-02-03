package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ave {
    public final avj a;

    public ave(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new avh(cameraDevice);
        } else {
            this.a = new avg(cameraDevice, new avi(handler));
        }
    }
}
