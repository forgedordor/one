package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        int iF = 0;
        boolean zD2 = false;
        boolean zD3 = false;
        String strT = null;
        int[] iArrH = null;
        byte[] bArrE = null;
        String strT2 = null;
        String strT3 = null;
        Account account = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 5:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 6:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 8:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 9:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 10:
                    zD3 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new KeyCreationRequestOptions(strT, zD, iF, iArrH, bArrE, strT2, strT3, account, zD2, zD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyCreationRequestOptions[i];
    }
}
