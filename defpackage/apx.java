package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apx {
    public static CameraDevice.StateCallback a(List list) {
        return list.isEmpty() ? new apw() : list.size() == 1 ? (CameraDevice.StateCallback) list.get(0) : new apv(list);
    }
}
