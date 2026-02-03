package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqj extends ljg {
    public static final Parcelable.Creator<eeqj> CREATOR = new eeqi();
    public String a;

    public eeqj(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readString();
    }

    @Override // defpackage.ljg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public eeqj(Parcelable parcelable) {
        super(parcelable);
    }
}
