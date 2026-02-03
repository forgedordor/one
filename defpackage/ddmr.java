package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.libs.identity.ClientIdentity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddmr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        ArrayList arrayListZ = null;
        ClientIdentity clientIdentity = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD == 4) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 6) {
                strT3 = dclv.t(parcel, i);
            } else if (iD == 7) {
                clientIdentity = (ClientIdentity) dclv.n(parcel, i, ClientIdentity.CREATOR);
            } else if (iD != 8) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, Feature.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        strT.getClass();
        return new ClientIdentity(iF, strT, strT2, strT3, arrayListZ, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
