package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.ILocationStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpb extends ILocationStatusCallback.Stub {
    final /* synthetic */ defr a;

    public ddpb(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.location.internal.ILocationStatusCallback
    public final void onResult(Status status, Location location) {
        dcjb.b(status, location, this.a);
    }
}
