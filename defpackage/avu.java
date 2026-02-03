package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avu implements avo {
    final CameraManager a;
    final Object b;

    public avu(Context context, Object obj) {
        this.a = (CameraManager) context.getSystemService("camera");
        this.b = obj;
    }

    @Override // defpackage.avo
    public CameraCharacteristics a(String str) throws aub {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }

    @Override // defpackage.avo
    public Set b() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.avo
    public void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, aub {
        lcg.i(executor);
        lcg.i(stateCallback);
        try {
            this.a.openCamera(str, new avd(executor, stateCallback), ((avt) this.b).b);
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }

    @Override // defpackage.avo
    public void d(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        avn avnVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        Object obj = this.b;
        if (availabilityCallback != null) {
            Map map = ((avt) obj).a;
            synchronized (map) {
                avnVar = (avn) map.get(availabilityCallback);
                if (avnVar == null) {
                    avnVar = new avn(executor, availabilityCallback);
                    map.put(availabilityCallback, avnVar);
                }
            }
        } else {
            avnVar = null;
        }
        this.a.registerAvailabilityCallback(avnVar, ((avt) obj).b);
    }

    @Override // defpackage.avo
    public void e(CameraManager.AvailabilityCallback availabilityCallback) {
        avn avnVar;
        if (availabilityCallback != null) {
            Map map = ((avt) this.b).a;
            synchronized (map) {
                avnVar = (avn) map.remove(availabilityCallback);
            }
        } else {
            avnVar = null;
        }
        if (avnVar != null) {
            synchronized (avnVar.b) {
                avnVar.c = true;
            }
        }
        this.a.unregisterAvailabilityCallback(avnVar);
    }

    @Override // defpackage.avo
    public final String[] f() throws aub {
        try {
            return this.a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }
}
