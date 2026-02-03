package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awa {
    public final avz a;

    public awa(avz avzVar) {
        this.a = avzVar;
    }

    public static awa b(auy auyVar) {
        DynamicRangeProfiles dynamicRangeProfilesM551m;
        awa awaVar = null;
        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfilesM551m = ja$$ExternalSyntheticApiModelOutline0.m551m(auyVar.c(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            lcg.d(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
            awaVar = new awa(new awb(dynamicRangeProfilesM551m));
        }
        return awaVar == null ? awc.a : awaVar;
    }

    public final DynamicRangeProfiles a() {
        lcg.d(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.a.a();
    }

    public final Set c() {
        return this.a.c();
    }
}
