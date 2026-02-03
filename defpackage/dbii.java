package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbii implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        GlobalSearchApplicationInfo globalSearchApplicationInfo = null;
        GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                globalSearchApplicationInfo = (GlobalSearchApplicationInfo) dclv.n(parcel, i, GlobalSearchApplicationInfo.CREATOR);
            } else if (iD == 2) {
                globalSearchAppCorpusFeaturesArr = (GlobalSearchAppCorpusFeatures[]) dclv.J(parcel, i, GlobalSearchAppCorpusFeatures.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GlobalSearchApplication(globalSearchApplicationInfo, globalSearchAppCorpusFeaturesArr, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplication[i];
    }
}
