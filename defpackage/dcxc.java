package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.credentialstore.KeyMetadata;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        String strT = null;
        String strT2 = null;
        Bitmap bitmap = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 4) {
                zD = dclv.D(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bitmap = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new KeyMetadata(bArrE, strT, strT2, zD, bitmap);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyMetadata[i];
    }
}
