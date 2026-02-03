package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        IBinder iBinderL = null;
        Float fQ = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                iBinderL = dclv.l(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                fQ = dclv.q(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new Cap(iF, iBinderL != null ? new ddrc(IObjectWrapper.Stub.asInterface(iBinderL)) : null, fQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Cap[i];
    }
}
