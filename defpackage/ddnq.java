package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LastLocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ClientIdentity clientIdentity = null;
        int iF = 0;
        boolean zD = false;
        long jI = Long.MAX_VALUE;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                jI = dclv.i(parcel, i);
            } else if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                zD = dclv.D(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                clientIdentity = (ClientIdentity) dclv.n(parcel, i, ClientIdentity.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new LastLocationRequest(jI, iF, zD, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
