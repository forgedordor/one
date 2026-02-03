package defpackage;

import android.location.Location;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzy {
    public static boolean a(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
    }
}
