package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFileData;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddws implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CallingCardFileData callingCardFileData = null;
        int iF = 0;
        CallingCardMetadata callingCardMetadata = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                callingCardFileData = (CallingCardFileData) dclv.n(parcel, i, CallingCardFileData.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                callingCardMetadata = (CallingCardMetadata) dclv.n(parcel, i, CallingCardMetadata.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CreateCallingCardRequest(iF, callingCardFileData, callingCardMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateCallingCardRequest[i];
    }
}
