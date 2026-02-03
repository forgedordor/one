package defpackage;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AddListenerRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        IBinder iBinderL = null;
        IntentFilter[] intentFilterArr = null;
        String strT = null;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iBinderL = dclv.l(parcel, i);
            } else if (iD == 3) {
                intentFilterArr = (IntentFilter[]) dclv.J(parcel, i, IntentFilter.CREATOR);
            } else if (iD == 4) {
                strT = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AddListenerRequest(iBinderL, intentFilterArr, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AddListenerRequest[i];
    }
}
