package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avq extends avu {
    public avq(Context context) {
        super(context, null);
    }

    private static final boolean g(Throwable th) {
        StackTraceElement[] stackTrace;
        return Build.VERSION.SDK_INT == 28 && th.getClass().equals(RuntimeException.class) && (stackTrace = th.getStackTrace()) != null && "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private static final void h(Throwable th) throws aub {
        throw new aub(th);
    }

    @Override // defpackage.avu, defpackage.avo
    public CameraCharacteristics a(String str) throws aub {
        try {
            return super.a(str);
        } catch (RuntimeException e) {
            if (g(e)) {
                h(e);
            }
            throw e;
        }
    }

    @Override // defpackage.avu, defpackage.avo
    public void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, aub {
        try {
            this.a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new aub(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (g(e4)) {
                h(e4);
            }
            throw e4;
        }
    }

    @Override // defpackage.avu, defpackage.avo
    public final void d(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // defpackage.avu, defpackage.avo
    public final void e(CameraManager.AvailabilityCallback availabilityCallback) {
        this.a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
