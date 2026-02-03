package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emv implements Parcelable {
    public static final Parcelable.Creator<emv> CREATOR = new emu();
    private final int a;

    public emv(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emv) && this.a == ((emv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DefaultLazyKey(index=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
