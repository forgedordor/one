package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.dto.ParcelableInstant;
import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;
import com.google.android.gms.time.trustedtime.dto.ParcelableTicks;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dehb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ParcelableDuration parcelableDuration = null;
        ParcelableInstant parcelableInstant = null;
        ParcelableTicks parcelableTicks = null;
        ArrayList arrayListZ = null;
        ArrayList arrayListZ2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                parcelableDuration = (ParcelableDuration) dclv.n(parcel, i, ParcelableDuration.CREATOR);
            } else if (iD == 2) {
                parcelableInstant = (ParcelableInstant) dclv.n(parcel, i, ParcelableInstant.CREATOR);
            } else if (iD == 3) {
                parcelableTicks = (ParcelableTicks) dclv.n(parcel, i, ParcelableTicks.CREATOR);
            } else if (iD == 4) {
                arrayListZ = dclv.z(parcel, i, ParcelableClockAdjustmentPeriod.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                arrayListZ2 = dclv.z(parcel, i, ParcelableClockAdjustmentPeriod.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new TimeSignalResult(parcelableDuration, parcelableInstant, parcelableTicks, arrayListZ, arrayListZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeSignalResult[i];
    }
}
