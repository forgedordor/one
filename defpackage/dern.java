package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dern implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, CapabilityInfoParcelable.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetAllCapabilitiesResponse(iF, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAllCapabilitiesResponse[i];
    }
}
