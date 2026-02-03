package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmc extends dwim {
    public static final Parcelable.Creator<dwmc> CREATOR = new dwmb();

    public dwmc(long j, dwjh dwjhVar, evqs evqsVar, dwjd dwjdVar) {
        super(j, dwjhVar, evqsVar, dwjdVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeString(this.d.name());
    }
}
