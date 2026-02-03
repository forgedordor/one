package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oxt implements Parcelable {
    public static final Parcelable.Creator<oxt> CREATOR = new oxs();
    private final int a;

    public oxt(int i) {
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
        return (obj instanceof oxt) && this.a == ((oxt) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PagingPlaceholderKey(index=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
