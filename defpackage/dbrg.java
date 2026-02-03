package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        ArrayList arrayListZ2 = null;
        Account account = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    arrayListZ2 = dclv.z(parcel, i, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    zD = dclv.D(parcel, i);
                    break;
                case 5:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 6:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 7:
                    strT = dclv.t(parcel, i);
                    break;
                case 8:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 9:
                    arrayListZ = dclv.z(parcel, i, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    strT3 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GoogleSignInOptions(iF, arrayListZ2, account, zD, zD2, zD3, strT, strT2, GoogleSignInOptions.b(arrayListZ), strT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
