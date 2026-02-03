package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 4:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 5:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 6:
                    bitmap = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
                    break;
                case 7:
                    bitmap2 = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new sly(strT, iF, iF2, iF3, iF4, bitmap, bitmap2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sly[i];
    }
}
