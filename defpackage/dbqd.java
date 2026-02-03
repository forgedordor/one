package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Account account = null;
        SignInCredential signInCredential = null;
        ArrayList arrayListZ = null;
        String strT = null;
        Intent intent = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        long jI = 0;
        long jI2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 2:
                    signInCredential = (SignInCredential) dclv.n(parcel, i, SignInCredential.CREATOR);
                    break;
                case 3:
                    arrayListZ = dclv.z(parcel, i, Scope.CREATOR);
                    break;
                case 4:
                    zD = dclv.D(parcel, i);
                    break;
                case 5:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 6:
                    jI = dclv.i(parcel, i);
                    break;
                case 7:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 8:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 9:
                    strT = dclv.t(parcel, i);
                    break;
                case 10:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 11:
                    intent = (Intent) dclv.n(parcel, i, Intent.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new InternalSignInCredentialWrapper(account, signInCredential, arrayListZ, zD, zD2, jI, zD3, jI2, strT, zD4, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InternalSignInCredentialWrapper[i];
    }
}
