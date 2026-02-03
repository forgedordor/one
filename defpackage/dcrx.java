package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcrx implements dcgy, dcii {
    public final Queue a = new ArrayDeque();
    public Status b = new Status(17, "None of the GmsClient connection callbacks have been called.");

    private final void a() {
        while (true) {
            Consumer consumerM177m = aky$$ExternalSyntheticApiModelOutline0.m177m(this.a.poll());
            if (consumerM177m == null) {
                return;
            } else {
                consumerM177m.accept(this.b);
            }
        }
    }

    @Override // defpackage.dcgy
    public final void onConnected(Bundle bundle) {
        this.b = Status.a;
        a();
    }

    @Override // defpackage.dcii
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.b = new Status(connectionResult, "Connection to the GMS Core module failed.");
        a();
    }

    @Override // defpackage.dcgy
    public final void onConnectionSuspended(int i) {
        this.b = new Status(20, a.g(i, "Connection to the GMS Core module was suspended, cause: "));
        a();
    }
}
