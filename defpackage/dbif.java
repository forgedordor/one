package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbif implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Account account = null;
        String strT = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            } else if (iD == 2) {
                zD = dclv.D(parcel, i);
            } else if (iD == 3) {
                zD2 = dclv.D(parcel, i);
            } else if (iD == 4) {
                zD3 = dclv.D(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetRecentContextCall$Request(account, zD, zD2, zD3, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetRecentContextCall$Request[i];
    }
}
