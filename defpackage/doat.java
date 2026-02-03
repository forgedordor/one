package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doat implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new doau((doin) Enum.valueOf(doin.class, parcel.readString()), (dohm) parcel.readParcelable(doau.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), (doas) parcel.readParcelable(doau.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new doau[i];
    }
}
