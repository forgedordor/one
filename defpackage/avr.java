package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avr extends avq {
    public avr(Context context) {
        super(context);
    }

    @Override // defpackage.avq, defpackage.avu, defpackage.avo
    public final CameraCharacteristics a(String str) throws aub {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }

    @Override // defpackage.avq, defpackage.avu, defpackage.avo
    public final void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, aub {
        try {
            this.a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }
}
