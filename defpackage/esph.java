package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esph extends fbur {
    final /* synthetic */ Context a;

    public esph(Context context) {
        this.a = context;
    }

    @Override // defpackage.fbur
    public final Status a(int i) {
        Status statusWithDescription;
        if (Build.VERSION.SDK_INT >= 28) {
            return Process.isIsolated() ? Status.b : Status.i.withDescription("Rejected by isIsolatedProcess() security policy. Not an isolated process (28+)");
        }
        Status status = espi.b;
        if (status != null) {
            return status;
        }
        synchronized (espi.a) {
            statusWithDescription = espi.b;
            if (statusWithDescription == null) {
                try {
                    ((ActivityManager) this.a.getSystemService("activity")).getRunningAppProcesses();
                    statusWithDescription = Status.i.withDescription("Rejected by isIsolatedProcess() security policy. Not an isolated process (legacy)");
                } catch (SecurityException unused) {
                    statusWithDescription = Status.b;
                }
                espi.b = statusWithDescription;
            }
        }
        return statusWithDescription;
    }
}
