package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        int i = parcel.readInt();
        return new dnvg(string, string2, string3, i != 0, (dohm) parcel.readParcelable(dnvg.class.getClassLoader()), null, null, parcel.readInt(), parcel.readInt(), 0L, null, null, 3680);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dnvg[i];
    }
}
