package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Account account = null;
        String strT = null;
        int iF = 0;
        Scope[] scopeArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            } else if (iD == 3) {
                scopeArr = (Scope[]) dclv.J(parcel, i, Scope.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new RecordConsentRequest(iF, account, scopeArr, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RecordConsentRequest[i];
    }
}
