package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.HasCapabilitiesRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Account account = null;
        String[] strArrK = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            } else if (iD == 2) {
                strArrK = dclv.K(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new HasCapabilitiesRequest(account, strArrK, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HasCapabilitiesRequest[i];
    }
}
