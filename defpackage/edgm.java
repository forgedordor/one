package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgm {
    public final PackageManager a;

    public edgm(PackageManager packageManager) {
        this.a = packageManager;
    }

    public final boolean a(Intent intent) {
        return !this.a.queryIntentActivities(intent, 65536).isEmpty();
    }
}
