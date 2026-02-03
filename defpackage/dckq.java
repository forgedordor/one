package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dckq {
    public static int a = 4225;
    public static final Object b = new Object();
    public static HandlerThread c;
    private static dckt d;

    public static dckq a(Context context) {
        synchronized (b) {
            if (d == null) {
                d = new dckt(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return d;
    }

    public final void b(ComponentName componentName, ServiceConnection serviceConnection) {
        c(new dckp(componentName, a), serviceConnection);
    }

    protected abstract void c(dckp dckpVar, ServiceConnection serviceConnection);

    public abstract ConnectionResult d(dckp dckpVar, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        c(new dckp(str, str2, i, z), serviceConnection);
    }
}
