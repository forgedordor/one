package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmy extends dwiq {
    public static final Parcelable.Creator<dwmy> CREATOR = new dwmx();

    public dwmy(String str, String str2, dwpj dwpjVar, ejwi ejwiVar) {
        super(str, str2, dwpjVar, ejwiVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(((dwiq) this).a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeSerializable(this.d);
    }
}
