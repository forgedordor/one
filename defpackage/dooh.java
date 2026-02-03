package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dooh extends dook {
    public static final Parcelable.Creator<dooh> CREATOR = new doog();
    public final Map a;
    public final int b;

    public dooh(int i, Map map) {
        this.b = i;
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dooh)) {
            return false;
        }
        dooh doohVar = (dooh) obj;
        return this.b == doohVar.b && fdbq.f(this.a, doohVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Failed(reason=" + ((Object) Integer.toString(this.b - 2)) + ", failurePerMedia=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.b;
        parcel.writeString(i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNRECOGNIZED" : "REQUEST_CANCELLED" : "ALBUM_CREATION_FAILED" : "SOME_MEDIA_FAILED_TO_UPLOAD" : "UNKNOWN_REQUEST_FAILURE_REASON");
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString(((eaid) entry.getValue()).name());
        }
    }
}
