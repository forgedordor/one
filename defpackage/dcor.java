package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcor implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PhoneNumberVerification[] phoneNumberVerificationArr = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                phoneNumberVerificationArr = (PhoneNumberVerification[]) dclv.J(parcel, i, PhoneNumberVerification.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new VerifyPhoneNumberResponse(phoneNumberVerificationArr, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VerifyPhoneNumberResponse[i];
    }
}
