package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListY = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                arrayListY = dclv.y(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ShippingAddressRequirements(arrayListY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ShippingAddressRequirements[i];
    }
}
