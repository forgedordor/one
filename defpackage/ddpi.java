package defpackage;

import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpi extends ILocationCallback.Stub {
    public final ddpe a;

    public ddpi(ddpe ddpeVar) {
        this.a = ddpeVar;
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        ((ddoz) this.a).a.b(new ddpg());
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        ((ddoz) this.a).a.b(new ddpf(locationResult));
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onRemoved() {
        ((ddoz) this.a).a.b(new ddph(this));
    }
}
