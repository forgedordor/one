package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.ReauthRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        GoogleAccount googleAccount = null;
        String strT = null;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                googleAccount = (GoogleAccount) dclv.n(parcel, i, GoogleAccount.CREATOR);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ReauthRequest(googleAccount, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReauthRequest[i];
    }
}
