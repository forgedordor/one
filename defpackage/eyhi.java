package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyhi {
    public static Object a(Context context) {
        ComponentCallbacks2 componentCallbacks2A = eygs.a(context.getApplicationContext());
        boolean z = componentCallbacks2A instanceof eyhx;
        Object[] objArr = {componentCallbacks2A.getClass()};
        if (z) {
            return ((eyhx) componentCallbacks2A).bb();
        }
        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", objArr));
    }
}
