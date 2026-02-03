package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StampStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        IBinder iBinderL = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 2) {
                dclv.C(parcel, i);
            } else {
                iBinderL = dclv.l(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new StampStyle(iBinderL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StampStyle[i];
    }
}
