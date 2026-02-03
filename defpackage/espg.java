package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espg extends fbur {
    final /* synthetic */ PackageManager a;

    public espg(PackageManager packageManager) {
        this.a = packageManager;
    }

    @Override // defpackage.fbur
    public final Status a(int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (!Process.isIsolatedUid(i)) {
                return Status.i.withDescription("Rejected by remoteIsIsolatedProcess() security policy. Not an isolated process");
            }
        } else if (this.a.getPackagesForUid(i) != null) {
            return Status.i.withDescription("Rejected by remoteIsIsolatedProcess() security policy. Remote process has associated packages");
        }
        return Status.b;
    }
}
