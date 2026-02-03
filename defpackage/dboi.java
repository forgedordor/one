package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dboi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        HashSet hashSet = new HashSet();
        int iF = 0;
        ArrayList arrayListZ = null;
        AccountTransferProgress accountTransferProgress = null;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
                hashSet.add(1);
            } else if (iD == 2) {
                arrayListZ = dclv.z(parcel, i, AuthenticatorAnnotatedData.CREATOR);
                hashSet.add(2);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
                hashSet.add(3);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                accountTransferProgress = (AccountTransferProgress) dclv.n(parcel, i, AccountTransferProgress.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iH) {
            return new AccountTransferMsg(hashSet, iF, arrayListZ, iF2, accountTransferProgress);
        }
        throw new dclu(a.g(iH, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountTransferMsg[i];
    }
}
