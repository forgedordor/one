package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFileData;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.UpdateCallingCardRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CallingCardIdentifier callingCardIdentifier = null;
        CallingCardFileData callingCardFileData = null;
        CallingCardMetadata callingCardMetadata = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                callingCardIdentifier = (CallingCardIdentifier) dclv.n(parcel, i, CallingCardIdentifier.CREATOR);
            } else if (iD == 2) {
                callingCardFileData = (CallingCardFileData) dclv.n(parcel, i, CallingCardFileData.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                callingCardMetadata = (CallingCardMetadata) dclv.n(parcel, i, CallingCardMetadata.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new UpdateCallingCardRequest(callingCardIdentifier, callingCardFileData, callingCardMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateCallingCardRequest[i];
    }
}
