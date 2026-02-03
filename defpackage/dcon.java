package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.SimCapability;
import com.google.android.gms.constellation.VerificationCapability;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        ArrayList arrayListZ = null;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 4) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, VerificationCapability.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new SimCapability(iF, strT, iF2, strT2, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SimCapability[i];
    }
}
