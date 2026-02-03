package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.UploadRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Account account = null;
        String strT = null;
        String strT2 = null;
        long jI = 0;
        long jI2 = 0;
        long jI3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    jI = dclv.i(parcel, i);
                    break;
                case 5:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 6:
                    jI3 = dclv.i(parcel, i);
                    break;
                case 7:
                    strT2 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new UploadRequest(account, strT, jI, jI2, jI3, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UploadRequest[i];
    }
}
