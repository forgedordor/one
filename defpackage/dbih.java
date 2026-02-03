package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                featureArr = (Feature[]) dclv.J(parcel, i, Feature.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GlobalSearchAppCorpusFeatures(strT, featureArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchAppCorpusFeatures[i];
    }
}
