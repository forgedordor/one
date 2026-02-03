package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class desv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                dataHolder = (DataHolder) dclv.n(parcel, i, DataHolder.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new NodeMigratedEventParcelable(strT, dataHolder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NodeMigratedEventParcelable[i];
    }
}
