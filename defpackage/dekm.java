package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        float fC = 0.0f;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 4) {
                iF3 = dclv.f(parcel, i);
            } else if (iD == 5) {
                iF4 = dclv.f(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                fC = dclv.c(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new BoundingBoxParcel(iF, iF2, iF3, iF4, fC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BoundingBoxParcel[i];
    }
}
