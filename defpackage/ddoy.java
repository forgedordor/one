package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddoy extends ddnt {
    final /* synthetic */ defr a;
    final /* synthetic */ ddpm b;

    public ddoy(ddpm ddpmVar, defr defrVar) {
        this.a = defrVar;
        this.b = ddpmVar;
    }

    @Override // defpackage.ddnt
    public final void a(LocationResult locationResult) {
        List list = locationResult.b;
        int size = list.size();
        this.a.d(size == 0 ? null : (Location) list.get(size - 1));
        try {
            this.b.M(dcic.a(this, "GetCurrentLocation"), false, new defr());
        } catch (RemoteException unused) {
        }
    }
}
