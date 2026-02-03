package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        String strT = null;
        String strT2 = null;
        String[] strArrK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                strArrK = dclv.K(parcel, i);
            } else if (iD == 4) {
                iF = dclv.f(parcel, i);
            } else if (iD == 5) {
                zD = dclv.D(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ServiceDumpRequest(strT, strT2, strArrK, iF, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ServiceDumpRequest[i];
    }
}
