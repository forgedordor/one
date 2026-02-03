package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ParcelableDuration parcelableDuration = null;
        ParcelableDuration parcelableDuration2 = null;
        ParcelableDuration parcelableDuration3 = null;
        ParcelableDuration parcelableDuration4 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                parcelableDuration = (ParcelableDuration) dclv.n(parcel, i, ParcelableDuration.CREATOR);
            } else if (iD == 2) {
                parcelableDuration2 = (ParcelableDuration) dclv.n(parcel, i, ParcelableDuration.CREATOR);
            } else if (iD == 3) {
                parcelableDuration3 = (ParcelableDuration) dclv.n(parcel, i, ParcelableDuration.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                parcelableDuration4 = (ParcelableDuration) dclv.n(parcel, i, ParcelableDuration.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ParcelableClockAdjustmentPeriod(parcelableDuration, parcelableDuration2, parcelableDuration3, parcelableDuration4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableClockAdjustmentPeriod[i];
    }
}
