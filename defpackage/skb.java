package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        String strT = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strT2 = null;
        String strT3 = null;
        IBinder iBinderL = null;
        int iF = 0;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) dclv.n(parcel, i, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 7:
                    zD = dclv.D(parcel, i);
                    break;
                case 8:
                    iBinderL = dclv.l(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ska(bArrE, strT, iF, parcelFileDescriptor, strT2, strT3, zD, iBinderL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ska[i];
    }
}
