package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.RemoteUserReachability;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcun implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        RemoteUserReachability remoteUserReachability = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                remoteUserReachability = (RemoteUserReachability) dclv.n(parcel, i, RemoteUserReachability.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new LookupSingleRemoteReachabilityResponse(remoteUserReachability);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LookupSingleRemoteReachabilityResponse[i];
    }
}
