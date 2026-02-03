package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CallingCardRequestStatus callingCardRequestStatus = null;
        CallingCardIdentifier callingCardIdentifier = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                callingCardRequestStatus = (CallingCardRequestStatus) dclv.n(parcel, i, CallingCardRequestStatus.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                callingCardIdentifier = (CallingCardIdentifier) dclv.n(parcel, i, CallingCardIdentifier.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CreateCallingCardResponse(callingCardRequestStatus, callingCardIdentifier);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateCallingCardResponse[i];
    }
}
