package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dwmy(parcel.readString(), parcel.readString(), (dwpj) parcel.readParcelable(dwpk.class.getClassLoader()), (ejwi) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dwmy[i];
    }
}
