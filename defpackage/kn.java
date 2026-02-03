package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kn {
    public static kn a;
    public final Context b;
    public final km c = new km();
    private final LocationManager d;

    public kn(Context context, LocationManager locationManager) {
        this.b = context;
        this.d = locationManager;
    }

    public final Location a(String str) {
        try {
            LocationManager locationManager = this.d;
            if (locationManager.isProviderEnabled(str)) {
                return locationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
