package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eehn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new eehq((eeis) parcel.readParcelable(eeis.class.getClassLoader()), (eeis) parcel.readParcelable(eeis.class.getClassLoader()), (eehp) parcel.readParcelable(eehp.class.getClassLoader()), (eeis) parcel.readParcelable(eeis.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eehq[i];
    }
}
