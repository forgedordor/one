package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcya implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DevicePublicKeyExtension();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DevicePublicKeyExtension[i];
    }
}
