package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionDelayFilters;
import com.google.android.gms.wearable.DataItemFilter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class denn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, DataItemFilter.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ConnectionDelayFilters(arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionDelayFilters[i];
    }
}
