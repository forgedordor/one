package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrp {
    public final IMarkerDelegate a;

    public ddrp(IMarkerDelegate iMarkerDelegate) {
        dclh.m(iMarkerDelegate);
        this.a = iMarkerDelegate;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ddrp)) {
            return false;
        }
        try {
            return this.a.equalsRemote(((ddrp) obj).a);
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }
}
