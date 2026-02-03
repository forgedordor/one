package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohf extends dohm {
    public static final Parcelable.Creator<dohf> CREATOR = new dohe();
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dohf(String str) {
        super(str);
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.dohm, defpackage.dogj
    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dohf) && fdbq.f(this.a, ((dohf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnknownImageFormat(subType=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
