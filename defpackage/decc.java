package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class decc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Status status = null;
        int[] iArrH = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                iArrH = dclv.H(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetPendingExperimentIdsCall$Response(status, iArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPendingExperimentIdsCall$Response[i];
    }
}
