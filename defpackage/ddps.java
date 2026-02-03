package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.SetGoogleLocationAccuracyRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddps implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = etrc.SOURCE_UNKNOWN.m;
        byte[] bArrE = null;
        boolean zD = false;
        byte[] bArrE2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                zD = dclv.D(parcel, i);
            } else if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                bArrE2 = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SetGoogleLocationAccuracyRequest(zD, iF, bArrE, bArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetGoogleLocationAccuracyRequest[i];
    }
}
