package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            return new dnvr((dokj) evsn.parseFrom(dokj.a, bArrCreateByteArray));
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dnvr[i];
    }
}
