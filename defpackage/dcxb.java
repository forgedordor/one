package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        long jI = 0;
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        String strT = null;
        byte[] bArrE4 = null;
        byte[] bArrE5 = null;
        Account account = null;
        KeyMetadata keyMetadata = null;
        byte[] bArrE6 = null;
        byte[] bArrE7 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 4:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 5:
                    bArrE3 = dclv.E(parcel, i);
                    break;
                case 6:
                    strT = dclv.t(parcel, i);
                    break;
                case 7:
                    bArrE4 = dclv.E(parcel, i);
                    break;
                case 8:
                    bArrE5 = dclv.E(parcel, i);
                    break;
                case 9:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 10:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 11:
                    keyMetadata = (KeyMetadata) dclv.n(parcel, i, KeyMetadata.CREATOR);
                    break;
                case 12:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 13:
                    bArrE6 = dclv.E(parcel, i);
                    break;
                case 14:
                    bArrE7 = dclv.E(parcel, i);
                    break;
                case 15:
                    jI = dclv.i(parcel, i);
                    break;
                case 16:
                    zD4 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new KeyData(iF, zD, bArrE, bArrE2, bArrE3, strT, bArrE4, bArrE5, account, zD2, keyMetadata, zD3, bArrE6, bArrE7, jI, zD4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyData[i];
    }
}
