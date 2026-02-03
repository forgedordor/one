package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.GetPnvCapabilitiesRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcog implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        ArrayList arrayListW = null;
        ArrayList arrayListW2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                arrayListW = dclv.w(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListW2 = dclv.w(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetPnvCapabilitiesRequest(strT, arrayListW, arrayListW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPnvCapabilitiesRequest[i];
    }
}
