package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaqt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        easo easoVar = (easo) parcel.readParcelable(easp.class.getClassLoader());
        ArrayList arrayList = parcel.readArrayList(easp.class.getClassLoader());
        ArrayList arrayList2 = parcel.readArrayList(easp.class.getClassLoader());
        ArrayList arrayList3 = parcel.readArrayList(easp.class.getClassLoader());
        if (parcel.readInt() == 0) {
            boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            boolValueOf = null;
        }
        return new eaqu(easoVar, arrayList, arrayList2, arrayList3, boolValueOf, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eaqu[i];
    }
}
