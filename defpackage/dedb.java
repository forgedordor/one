package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String[] strArrK = null;
        SuggestSpecification suggestSpecification = null;
        Bundle bundleK = null;
        int iF = 0;
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
                    iF = dclv.f(parcel, i);
                    break;
                case 5:
                    suggestSpecification = (SuggestSpecification) dclv.n(parcel, i, SuggestSpecification.CREATOR);
                    break;
                case 6:
                    bundleK = dclv.k(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new QuerySuggestCall$Request(strT, strT2, strArrK, iF, suggestSpecification, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QuerySuggestCall$Request[i];
    }
}
