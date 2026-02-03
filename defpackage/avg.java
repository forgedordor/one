package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class avg extends avf {
    public avg(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    @Override // defpackage.avj
    public void a(aws awsVar) throws CameraAccessException, aub {
        lcg.i(awsVar.a());
        List listB = awsVar.b();
        if (listB == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (awsVar.d() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        CameraDevice cameraDevice = this.a;
        String id = cameraDevice.getId();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            String strC = ((awg) it.next()).a.c();
            if (strC != null && !strC.isEmpty()) {
                bbs.f("CameraDeviceCompat", a.d(strC, id, "Camera ", ": Camera doesn't support physicalCameraId ", ". Ignoring."));
            }
        }
        aur aurVar = new aur(awsVar.d(), awsVar.a());
        List listB2 = awsVar.b();
        Object obj = this.b;
        lcg.i(obj);
        awr awrVar = awsVar.a;
        awf awfVarC = awrVar.c();
        Handler handler = ((avi) obj).a;
        try {
            if (awfVarC != null) {
                cameraDevice.createReprocessableCaptureSessionByConfigurations((InputConfiguration) awfVarC.b(), aws.c(listB2), aurVar, handler);
            } else {
                if (awrVar.a() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(aws.c(listB2), aurVar, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listB2.size());
                Iterator it2 = listB2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((awg) it2.next()).a());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, aurVar, handler);
            }
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }
}
