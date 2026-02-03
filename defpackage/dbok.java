package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbok implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        HashSet hashSet = new HashSet();
        int iF = 0;
        AuthenticatorTransferInfo authenticatorTransferInfo = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
                hashSet.add(1);
            } else if (iD == 2) {
                authenticatorTransferInfo = (AuthenticatorTransferInfo) dclv.n(parcel, i, AuthenticatorTransferInfo.CREATOR);
                hashSet.add(2);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
                hashSet.add(3);
            } else if (iD == 4) {
                strT2 = dclv.t(parcel, i);
                hashSet.add(4);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strT3 = dclv.t(parcel, i);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == iH) {
            return new AuthenticatorAnnotatedData(hashSet, iF, authenticatorTransferInfo, strT, strT2, strT3);
        }
        throw new dclu(a.g(iH, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAnnotatedData[i];
    }
}
