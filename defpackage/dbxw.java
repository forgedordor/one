package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.carrierauth.EapInfoRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new EapInfoRequest(iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EapInfoRequest[i];
    }
}
