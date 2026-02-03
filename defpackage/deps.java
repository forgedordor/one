package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AppWearDetailsParcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deps implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListY = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                zD = dclv.D(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                arrayListY = dclv.y(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AppWearDetailsParcelable(zD, arrayListY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppWearDetailsParcelable[i];
    }
}
