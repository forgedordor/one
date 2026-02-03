package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsx implements dltc<dltd> {
    public static final Parcelable.Creator<dlsx> CREATOR = new dlsv();
    public final String a;
    public final int b;

    public dlsx(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlsx)) {
            return false;
        }
        dlsx dlsxVar = (dlsx) obj;
        return fdbq.f(this.a, dlsxVar.a) && this.b == dlsxVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
    }

    public final String toString() {
        return "External(authority=" + this.a + ", entryPoint=" + ((Object) dlsw.a(this.b)) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(dlsw.a(this.b));
    }
}
