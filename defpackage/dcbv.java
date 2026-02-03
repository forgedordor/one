package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.sampler.SamplerConfigParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        double dB = 0.0d;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                dB = dclv.b(parcel, i);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 4) {
                iF3 = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SamplerConfigParcelable(iF, dB, iF2, iF3, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SamplerConfigParcelable[i];
    }
}
