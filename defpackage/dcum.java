package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcum implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        DuoId duoId = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                duoId = (DuoId) dclv.n(parcel, i, DuoId.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new LookupSingleRemoteReachabilityRequest(duoId, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LookupSingleRemoteReachabilityRequest[i];
    }
}
