package defpackage;

import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzn {
    private final NetworkCapabilities a;

    public ffzn(NetworkCapabilities networkCapabilities) {
        this.a = networkCapabilities;
    }

    public final boolean a(int i) {
        NetworkCapabilities networkCapabilities = this.a;
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(i);
        }
        return true;
    }

    public final boolean b(int i) {
        NetworkCapabilities networkCapabilities = this.a;
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(i);
        }
        return true;
    }
}
