package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwme extends dwio {
    public static final Parcelable.Creator<dwme> CREATOR = new dwmd();

    public dwme(ejwi ejwiVar, Set set, ejwi ejwiVar2, String str) {
        super(ejwiVar, set, ejwiVar2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        parcel.writeStringList(arrayList);
        parcel.writeSerializable(this.c);
        parcel.writeString(this.d);
    }
}
