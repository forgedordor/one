package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmf {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public dzmf(Context context) throws Throwable {
        dzjr.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
