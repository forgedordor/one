package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cobalt.LogOccurrenceRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcdh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int[] iArrH = null;
        long jI = 0;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 3) {
                iF3 = dclv.f(parcel, i);
            } else if (iD == 4) {
                jI = dclv.i(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                iArrH = dclv.H(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new LogOccurrenceRequest(iF, iF2, iF3, jI, iArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogOccurrenceRequest[i];
    }
}
