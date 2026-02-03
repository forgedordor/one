package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundleK = null;
        String strT = null;
        String strT2 = null;
        long jI = 0;
        long jI2 = 0;
        long jI3 = 0;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    zD = dclv.D(parcel, i);
                    break;
                case 2:
                    jI = dclv.i(parcel, i);
                    break;
                case 3:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 4:
                    jI3 = dclv.i(parcel, i);
                    break;
                case 5:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 6:
                    strT = dclv.t(parcel, i);
                    break;
                case 7:
                    strT2 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new CorpusStatus(zD, jI, jI2, jI3, bundleK, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CorpusStatus[i];
    }
}
