package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dect implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String[] strArrK = null;
        QuerySpecification querySpecification = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 3) {
                strArrK = dclv.K(parcel, i);
            } else if (iD == 4) {
                querySpecification = (QuerySpecification) dclv.n(parcel, i, QuerySpecification.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetDocumentsCall$Request(strT, strT2, strArrK, querySpecification, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetDocumentsCall$Request[i];
    }
}
