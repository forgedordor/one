package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.GetPnvCapabilitiesResponse;
import com.google.android.gms.constellation.SimCapability;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcoh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, SimCapability.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetPnvCapabilitiesResponse(arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPnvCapabilitiesResponse[i];
    }
}
