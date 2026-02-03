package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionRestrictions;
import com.google.android.gms.wearable.DataItemFilter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deno implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListZ = dclv.z(parcel, i, DataItemFilter.CREATOR);
            } else if (iD == 2) {
                arrayListY = dclv.y(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListY2 = dclv.y(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ConnectionRestrictions(arrayListZ, arrayListY, arrayListY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionRestrictions[i];
    }
}
