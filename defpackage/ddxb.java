package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                iF2 = dclv.f(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ParcelableLoadImageOptions(iF, iF2, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableLoadImageOptions[i];
    }
}
