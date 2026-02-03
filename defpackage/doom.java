package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doom extends doon {
    public static final Parcelable.Creator<doom> CREATOR = new dool();
    private final Map a;

    public doom(Map map) {
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
        return (obj instanceof doom) && fdbq.f(this.a, ((doom) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InProgress(statePerMedia=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
