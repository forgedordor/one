package defpackage;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.frp.PersistentDeviceOwnerState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbuz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ComponentName componentName = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                componentName = (ComponentName) dclv.n(parcel, i, ComponentName.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PersistentDeviceOwnerState(componentName, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PersistentDeviceOwnerState[i];
    }
}
