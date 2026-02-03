package defpackage;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ana extends CameraManager.AvailabilityCallback {
    public boolean a = true;
    public final /* synthetic */ anm b;
    private final String c;

    public ana(anm anmVar, String str) {
        this.b = anmVar;
        this.c = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.c.equals(str)) {
            this.a = true;
            anm anmVar = this.b;
            if (anmVar.A == 4 || anmVar.A == 5) {
                anmVar.D(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.c.equals(str)) {
            this.a = false;
        }
    }
}
