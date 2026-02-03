package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.RequestContext;
import com.google.android.gms.kids.TrustedContactsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        IndividualContactRequest[] individualContactRequestArr = null;
        RequestContext requestContext = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                individualContactRequestArr = (IndividualContactRequest[]) dclv.J(parcel, i, IndividualContactRequest.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                requestContext = (RequestContext) dclv.n(parcel, i, RequestContext.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new TrustedContactsRequest(individualContactRequestArr, requestContext);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TrustedContactsRequest[i];
    }
}
