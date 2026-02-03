package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String[] strArrK = null;
        String[] strArrK2 = null;
        ParcelFileDescriptor[] parcelFileDescriptorArr = null;
        Account account = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 3:
                    strArrK = dclv.K(parcel, i);
                    break;
                case 4:
                    strArrK2 = dclv.K(parcel, i);
                    break;
                case 5:
                    parcelFileDescriptorArr = (ParcelFileDescriptor[]) dclv.J(parcel, i, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new OverrideFileGroupRequest(strT, strT2, strArrK, strArrK2, parcelFileDescriptorArr, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OverrideFileGroupRequest[i];
    }
}
