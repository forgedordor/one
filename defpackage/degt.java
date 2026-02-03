package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.time.dto.ParcelableDuration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                jI = dclv.i(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ParcelableDuration(jI, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableDuration[i];
    }
}
