package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbf {
    public static final String a(etgd etgdVar) {
        etgdVar.getClass();
        int iOrdinal = etgdVar.ordinal();
        if (iOrdinal == 1) {
            if (laa.b()) {
                return "android.permission.POST_NOTIFICATIONS";
            }
            throw new IllegalArgumentException("ANDROID_POST_NOTIFICATIONS should not be used on Android versions before T");
        }
        if (iOrdinal == 2) {
            return "android.permission.CAMERA";
        }
        if (iOrdinal == 3) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        Objects.toString(etgdVar);
        throw new IllegalArgumentException("Invalid AndroidPermissionType ".concat(etgdVar.toString()));
    }
}
