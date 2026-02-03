package defpackage;

import android.content.pm.PackageManager;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espl extends fbur {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ ekhx b;
    final /* synthetic */ dcer c;

    public espl(PackageManager packageManager, ekhx ekhxVar, dcer dcerVar) {
        this.a = packageManager;
        this.b = ekhxVar;
        this.c = dcerVar;
    }

    @Override // defpackage.fbur
    public final Status a(int i) {
        String[] packagesForUid = this.a.getPackagesForUid(i);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (this.b.contains(str)) {
                    return !this.c.d(i) ? Status.i.withDescription("Rejected by (1st-party only Allowlist) security policy. Not google-signed.") : Status.b;
                }
            }
        }
        return Status.i.withDescription("Rejected by (1st-party only Allowlist) security policy. Package not allowed.");
    }
}
