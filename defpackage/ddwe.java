package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        AccountWithDataSet accountWithDataSet = null;
        int[] iArrH = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                accountWithDataSet = (AccountWithDataSet) dclv.n(parcel, i, AccountWithDataSet.CREATOR);
            } else if (iD == 2) {
                iArrH = dclv.H(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetImportSimContactsSuggestionsRequest(accountWithDataSet, ekhx.o(eonc.h(iArrH)), zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetImportSimContactsSuggestionsRequest[i];
    }
}
