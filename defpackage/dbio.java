package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbio implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        String strT = null;
        String strT2 = null;
        Bundle bundleK = null;
        Account account = null;
        long jI = 0;
        long jI2 = 0;
        int iF = 0;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 2:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                default:
                    dclv.C(parcel, i);
                    break;
                case 8:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 9:
                    jI = dclv.i(parcel, i);
                    break;
                case 10:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 11:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PIMEUpdate(bArrE, bArrE2, iF, strT, strT2, zD, bundleK, jI, jI2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PIMEUpdate[i];
    }
}
