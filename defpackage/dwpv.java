package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwpv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iOrdinal = ((dwpu) parcel.readParcelable(getClass().getClassLoader())).ordinal();
        if (iOrdinal == 0) {
            return dwkt.b((dwpk) parcel.readParcelable(getClass().getClassLoader()));
        }
        if (iOrdinal == 1) {
            return dwkt.a((dwpr) parcel.readParcelable(getClass().getClassLoader()));
        }
        throw new RuntimeException(null, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dwpw[i];
    }
}
