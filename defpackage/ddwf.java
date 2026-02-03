package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int[] iArrH = null;
        AccountWithDataSet accountWithDataSet = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iArrH = dclv.H(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                accountWithDataSet = (AccountWithDataSet) dclv.n(parcel, i, AccountWithDataSet.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ImportSimContactsRequest(ekhx.o(eonc.h(iArrH)), accountWithDataSet);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ImportSimContactsRequest[i];
    }
}
