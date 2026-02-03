package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AccountWithAppRestrictionState;
import com.google.android.gms.auth.aang.AppRestrictionState;
import com.google.android.gms.auth.aang.GoogleAccount;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbne implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        GoogleAccount googleAccount = null;
        AppRestrictionState appRestrictionState = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                googleAccount = (GoogleAccount) dclv.n(parcel, i, GoogleAccount.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                appRestrictionState = (AppRestrictionState) dclv.n(parcel, i, AppRestrictionState.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AccountWithAppRestrictionState(googleAccount, appRestrictionState);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountWithAppRestrictionState[i];
    }
}
