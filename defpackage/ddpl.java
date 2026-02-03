package defpackage;

import android.location.Location;
import com.google.android.gms.location.ILocationListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpl extends ILocationListener.Stub {
    public final ddpe a;

    public ddpl(ddpe ddpeVar) {
        this.a = ddpeVar;
    }

    @Override // com.google.android.gms.location.ILocationListener
    public final void onLocationChanged(Location location) {
        this.a.b().b(new ddpj(location));
    }

    @Override // com.google.android.gms.location.ILocationListener
    public final void onRemoved() {
        this.a.b().b(new ddpk(this));
    }
}
