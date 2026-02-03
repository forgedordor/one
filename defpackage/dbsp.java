package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Account account = null;
        int iF = 0;
        CaptchaSolution captchaSolution = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                captchaSolution = (CaptchaSolution) dclv.n(parcel, i, CaptchaSolution.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GplusInfoRequest(iF, strT, captchaSolution, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GplusInfoRequest[i];
    }
}
