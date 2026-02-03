package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqj {
    public final IGoogleMapDelegate a;
    private ddqy b;

    public ddqj(IGoogleMapDelegate iGoogleMapDelegate) {
        new HashMap();
        new HashMap();
        dclh.m(iGoogleMapDelegate);
        this.a = iGoogleMapDelegate;
    }

    public final ddqy a() {
        try {
            if (this.b == null) {
                this.b = new ddqy(this.a.getUiSettings());
            }
            return this.b;
        } catch (RemoteException e) {
            throw new ddrw(e);
        }
    }
}
