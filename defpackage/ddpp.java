package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        LocationRequestInternal locationRequestInternal = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderL3 = null;
        String strT = null;
        int iF = 1;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) dclv.n(parcel, i, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderL2 = dclv.l(parcel, i);
                    break;
                case 6:
                    iBinderL3 = dclv.l(parcel, i);
                    break;
                case 7:
                default:
                    dclv.C(parcel, i);
                    break;
                case 8:
                    strT = dclv.t(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new LocationRequestUpdateData(iF, locationRequestInternal, iBinderL, iBinderL2, pendingIntent, iBinderL3, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }
}
