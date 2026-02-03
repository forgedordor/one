package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new eapu((eatb) parcel.readParcelable(eapm.class.getClassLoader()), (eatb) parcel.readParcelable(eapm.class.getClassLoader()), (eatb) parcel.readParcelable(eapm.class.getClassLoader()), (eatb) parcel.readParcelable(eapm.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eapu[i];
    }
}
