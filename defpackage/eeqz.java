package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqz extends ljg {
    public static final Parcelable.Creator<eeqz> CREATOR = new eeqy();
    public String a;
    public int b;

    public eeqz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    @Override // defpackage.ljg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public eeqz(Parcelable parcelable) {
        super(parcelable);
    }
}
