package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Account account = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetDefaultAccountResult(account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetDefaultAccountResult[i];
    }
}
