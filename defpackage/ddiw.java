package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.Example;
import com.google.android.gms.learning.Features;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddiw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Features features = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                features = (Features) dclv.n(parcel, i, Features.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new Example(features);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Example[i];
    }
}
