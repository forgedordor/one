package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Bundle bundleK = null;
        boolean zD = false;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                featureArr = (Feature[]) dclv.J(parcel, i, Feature.CREATOR);
            } else if (iD == 3) {
                zD = dclv.D(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetGlobalSearchSourcesCall$CorpusInfo(strT, featureArr, zD, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$CorpusInfo[i];
    }
}
