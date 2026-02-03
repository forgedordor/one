package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        ArrayList arrayListZ = null;
        int iF = 0;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                arrayListZ = dclv.z(parcel, i, MddFile.CREATOR);
            } else if (iD == 3) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new FileGroupResponse(strT, strT2, iF, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileGroupResponse[i];
    }
}
