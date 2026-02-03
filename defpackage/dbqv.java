package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte[] bArrE = null;
        String strT2 = null;
        long jI = 0;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 3) {
                jI = dclv.i(parcel, i);
            } else if (iD == 4) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 5) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 1000) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ProxyGrpcRequest(iF, strT, iF2, jI, bArrE, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyGrpcRequest[i];
    }
}
