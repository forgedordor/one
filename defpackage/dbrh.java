package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strT2 = "";
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 4) {
                strT = dclv.t(parcel, i);
            } else if (iD == 7) {
                googleSignInAccount = (GoogleSignInAccount) dclv.n(parcel, i, GoogleSignInAccount.CREATOR);
            } else if (iD != 8) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SignInAccount(strT, googleSignInAccount, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
