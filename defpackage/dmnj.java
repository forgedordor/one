package defpackage;

import android.hardware.Camera;
import android.media.MediaActionSound;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmnj {
    private static final ekrg c = ekrg.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraSoundController");
    public final fdjx a;
    public final MediaActionSound b;

    public dmnj(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = fdjxVar;
        this.b = new MediaActionSound();
    }

    public static final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return MediaActionSound.mustPlayShutterSound();
        }
        fcvy it = fddu.r(0, Camera.getNumberOfCameras()).iterator();
        while (((fddp) it).a) {
            int iA = it.a();
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(iA, cameraInfo);
                if (!cameraInfo.canDisableShutterSound) {
                    return true;
                }
            } catch (RuntimeException e) {
                ((ekrd) ((ekrd) c.i()).g(e).h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraSoundController", "mustPlayShutterSound", 29, "CameraSoundController.kt")).q("Error getting camera info from legacy Camera API");
                return true;
            }
        }
        return false;
    }
}
