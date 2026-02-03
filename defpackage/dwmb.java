package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dwmc(parcel.readLong(), (dwjh) parcel.readSerializable(), (evqs) parcel.readSerializable(), (dwjd) Enum.valueOf(dwjd.class, parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dwmc[i];
    }
}
