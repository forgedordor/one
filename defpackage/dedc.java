package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Status status = null;
        SuggestionResults suggestionResults = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            } else if (iD == 2) {
                suggestionResults = (SuggestionResults) dclv.n(parcel, i, SuggestionResults.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new QuerySuggestCall$Response(status, suggestionResults, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QuerySuggestCall$Response[i];
    }
}
