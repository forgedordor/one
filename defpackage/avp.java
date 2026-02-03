package defpackage;

import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avp {
    public final avo a;
    private final Map b = new ArrayMap(4);

    public avp(avo avoVar) {
        this.a = avoVar;
    }

    public final auy a(String str) {
        auy auyVar;
        Map map = this.b;
        synchronized (map) {
            auyVar = (auy) map.get(str);
            if (auyVar == null) {
                try {
                    auy auyVar2 = new auy(this.a.a(str), str);
                    map.put(str, auyVar2);
                    auyVar = auyVar2;
                } catch (AssertionError e) {
                    throw new aub(e.getMessage(), e);
                }
            }
        }
        return auyVar;
    }

    public final void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.a.c(str, executor, stateCallback);
    }
}
