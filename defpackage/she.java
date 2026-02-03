package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class she implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Bitmap bitmap = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
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
                bitmap = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
            } else if (iD == 4) {
                iF2 = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) dclv.n(parcel, i, ParcelFileDescriptor.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new shd(iF, strT, bitmap, iF2, parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new shd[i];
    }
}
