package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auy {
    public final String a;
    public final aux b;
    private final Map c = new HashMap();
    private avv d = null;

    public auy(CameraCharacteristics cameraCharacteristics, String str) {
        this.b = Build.VERSION.SDK_INT >= 28 ? new auw(cameraCharacteristics) : new aux(cameraCharacteristics);
        this.a = str;
    }

    public final int a() {
        Integer num = null;
        if (d() && Build.VERSION.SDK_INT >= 35) {
            num = (Integer) c(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final avv b() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.d = new avv(streamConfigurationMap, new axg(this.a));
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.d;
    }

    public final Object c(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return this.b.a(key);
        }
        synchronized (this) {
            Map map = this.c;
            Object obj = map.get(key);
            if (obj != null) {
                return obj;
            }
            Object objA = this.b.a(key);
            if (objA != null) {
                map.put(key, objA);
            }
            return objA;
        }
    }

    public final boolean d() {
        Boolean bool = (Boolean) c(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }
}
