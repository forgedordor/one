package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        PendingIntent pendingIntent = null;
        String strT = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                iBinderL = dclv.l(parcel, i);
            } else if (iD == 3) {
                iBinderL2 = dclv.l(parcel, i);
            } else if (iD == 4) {
                pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new LocationReceiver(iF, iBinderL, iBinderL2, pendingIntent, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationReceiver[i];
    }
}
