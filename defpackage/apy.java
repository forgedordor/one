package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apy {
    public static boolean a(avp avpVar, String str) throws bbq {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) avpVar.a(str).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (aub e) {
            throw new bbq(new azj(e));
        }
    }
}
