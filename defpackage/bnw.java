package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnw {
    public static Context a(Context context) {
        int deviceId;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 34 && (deviceId = context.getDeviceId()) != applicationContext.getDeviceId()) {
            applicationContext = applicationContext.createDeviceContext(deviceId);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            String attributionTag = context.getAttributionTag();
            if (!Objects.equals(attributionTag, applicationContext.getAttributionTag())) {
                return applicationContext.createAttributionContext(attributionTag);
            }
        }
        return applicationContext;
    }
}
