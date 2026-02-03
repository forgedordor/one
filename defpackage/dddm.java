package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dddm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        int iF = 0;
        Intent intent = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                intent = (Intent) dclv.n(parcel, i, Intent.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new OverflowMenuItem(iF, strT, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }
}
