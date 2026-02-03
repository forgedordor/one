package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CallingCardRequestStatus callingCardRequestStatus = null;
        Uri uri = null;
        String strT = null;
        CallingCardMetadata callingCardMetadata = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                callingCardRequestStatus = (CallingCardRequestStatus) dclv.n(parcel, i, CallingCardRequestStatus.CREATOR);
            } else if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            } else if (iD == 4) {
                strT = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                callingCardMetadata = (CallingCardMetadata) dclv.n(parcel, i, CallingCardMetadata.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetCallingCardResponse(callingCardRequestStatus, iF, uri, strT, callingCardMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCallingCardResponse[i];
    }
}
