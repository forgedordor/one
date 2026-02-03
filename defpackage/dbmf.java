package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.GetAccountsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String[] strArrK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                strArrK = dclv.K(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetAccountsRequest(strT, strArrK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAccountsRequest[i];
    }
}
