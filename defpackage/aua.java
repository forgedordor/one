package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aua {
    public static boolean a(auy auyVar, int i) {
        int[] iArr = (int[]) auyVar.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
